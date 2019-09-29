package ru.bitrapid.conversationexchangeclient.api;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import ru.bitrapid.conversationexchangeclient.api.rest.RestApiRequestData;

public class Helper {
    public static String restRequestDataToParamString(RestApiRequestData requestData){
        Class<?> c = requestData.getClass();
        Map<String, String> data = new HashMap<>();
        StringBuilder res = new StringBuilder();

        try {
            for(Field f : c.getDeclaredFields()){
                f.setAccessible(true);
                Object o = f.get(requestData);
                if(o != null){
                    data.put(f.getName(), o.toString());
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
            return "";
        }

        boolean isFirst = true;
        for(Map.Entry<String, String> entry : data.entrySet()){
            if(isFirst){
                isFirst = false;
                res.append("?");
            }
            else{
                res.append("&");
            }
            res.append(entry.getKey());
            res.append("=");
            res.append(entry.getValue());
        }

        return res.toString();
    }
}
