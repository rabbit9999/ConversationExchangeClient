package ru.bitrapid.conversationexchangeclient.api;

import ru.bitrapid.conversationexchangeclient.Config;
import ru.bitrapid.conversationexchangeclient.api.rest.AsyncResponseGetter;
import ru.bitrapid.conversationexchangeclient.api.rest.RestApiCallback;
import ru.bitrapid.conversationexchangeclient.api.rest.RestApiRequestData;
import ru.bitrapid.conversationexchangeclient.api.rest.SearchResultFactory;
import ru.bitrapid.conversationexchangeclient.data.model.SearchResult;

public class Rest {


    private static Rest instance;

    public static Rest getInstance(){
        if(instance == null){
            instance = new Rest();
        }
        return instance;
    }

    private Rest(){

    }

    public void doSearchRequest(RestApiRequestData requestData, final RestApiCallback callback){
        String url = Config.SEARCH_REAST_URL + Helper.restRequestDataToParamString(requestData);
        AsyncResponseGetter getter = new AsyncResponseGetter();
        getter.setCallback(new RestApiCallback<String>() {
            @Override
            public void run(String s) {
                SearchResult result = new SearchResultFactory().build(s);
                callback.run(result);
            }
        });
        getter.execute(url);
    }
}
