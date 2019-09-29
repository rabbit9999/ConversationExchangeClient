package ru.bitrapid.conversationexchangeclient.data;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    private static Toaster instance;
    private static Context context;

    public static void init(Context c){
        context = c;
        instance = new Toaster();
    }

    private Toaster(){

    }

    public static Toaster getInstance(){
        if(instance == null){
            throw new RuntimeException("Toaster is not ready!");
        }
        return instance;
    }

    public void error(String err){
        Toast.makeText(context, "Error occurred:\n" + err, Toast.LENGTH_SHORT).show();
    }

    public void message(String mess){
        Toast.makeText(context, mess, Toast.LENGTH_SHORT).show();
    }
}
