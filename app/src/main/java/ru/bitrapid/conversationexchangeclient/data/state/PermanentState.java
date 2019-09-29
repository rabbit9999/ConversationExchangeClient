package ru.bitrapid.conversationexchangeclient.data.state;

import android.content.Context;
import android.content.SharedPreferences;

import java.lang.reflect.Field;

import ru.bitrapid.conversationexchangeclient.App;

public abstract class PermanentState {
    private SharedPreferences storage;
    private Class<? extends PermanentState> childClass;

    protected PermanentState(Class<? extends PermanentState> c){
        childClass = c;
        storage = App.getContext().getSharedPreferences(childClass.getCanonicalName(), Context.MODE_PRIVATE);
    }

    protected void syncStorage(){
        SharedPreferences.Editor editor = storage.edit();
        for(Field field : childClass.getDeclaredFields()){
            if(field.isAnnotationPresent(Permanent.class)){
                try {
                    field.setAccessible(true);
                    if(field.getType().equals(String.class)){
                        editor.putString(field.getName(), (String)field.get(this));
                    }
                    else if(field.getType().equals(int.class) || field.getType().equals(Integer.class)){
                        editor.putInt(field.getName(), field.getInt(this));
                    }
                    else if(field.getType().equals(boolean.class) || field.getType().equals(Boolean.class)){
                        editor.putBoolean(field.getName(), field.getBoolean(this));
                    }
                    else{
                        throw new RuntimeException("Unsupported data type: " + field.getType());
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }

            }
        }
        editor.apply();
    }

    protected void loadData(){
        for(Field field : childClass.getDeclaredFields()){
            if(field.isAnnotationPresent(Permanent.class)){
                try {
                    field.setAccessible(true);
                    if(field.getType().equals(String.class)){
                        field.set(this, storage.getString(field.getName(), ""));
                    }
                    else if(field.getType().equals(int.class) || field.getType().equals(Integer.class)){
                        field.setInt(this, storage.getInt(field.getName(), 0));
                    }
                    else if(field.getType().equals(boolean.class) || field.getType().equals(Boolean.class)){
                        field.setBoolean(this, storage.getBoolean(field.getName(), false));
                    }
                    else{
                        throw new RuntimeException("Unsupported data type: " + field.getType());
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }

            }
        }
    }
}
