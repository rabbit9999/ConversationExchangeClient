package ru.bitrapid.conversationexchangeclient.api.rest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.bitrapid.conversationexchangeclient.data.Toaster;
import ru.bitrapid.conversationexchangeclient.data.model.SearchResult;
import ru.bitrapid.conversationexchangeclient.data.model.SearchResultPLang;
import ru.bitrapid.conversationexchangeclient.data.model.SearchResultRecord;

public class SearchResultFactory {
    public SearchResult build(String jsonString){
        SearchResult result = new SearchResult();

        try {
            JSONObject parsed = new JSONObject(jsonString);
            fillObject(result, parsed);
            result.setRecords(getSearchResultRecordList(parsed.getJSONArray("records")));
            return result;
        }
        catch (JSONException e){
            e.printStackTrace();
            Toaster.getInstance().error(e.getMessage());
            return result;
        }
    }

    private void fillObject(Object o, JSONObject jo){
        for(Field f : o.getClass().getDeclaredFields()){
            if(!f.getType().equals(List.class) && !f.getType().equals(Map.class)){
                try {
                    if(!jo.isNull(f.getName())){
                        Object newObj = jo.get(f.getName());
                        f.setAccessible(true);
                        f.set(o, newObj);
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                    Toaster.getInstance().error(e.getMessage());
                }
            }
        }
    }

    private List<SearchResultRecord> getSearchResultRecordList(JSONArray jsArr){
        List<SearchResultRecord> result = new ArrayList<>();

        for(int i = 0; i < jsArr.length(); i++){
            try{
                if(!jsArr.isNull(i)){
                    SearchResultRecord record = new SearchResultRecord();
                    fillObject(record, jsArr.getJSONObject(i));
                    record.setPlangs(getSearchResultPLangList(jsArr.getJSONObject(i).getJSONArray("Plangs")));
                    result.add(record);
                }
            }
            catch (Exception e){
                e.printStackTrace();
                Toaster.getInstance().error(e.getMessage());
            }
        }
        return result;
    }

    private List<SearchResultPLang> getSearchResultPLangList(JSONArray jsArr){
        List<SearchResultPLang> result = new ArrayList<>();

        for(int i = 0; i < jsArr.length(); i++){
            try{
                if(!jsArr.isNull(i)){
                    SearchResultPLang pLang = new SearchResultPLang();
                    fillObject(pLang, jsArr.getJSONObject(i));
                    result.add(pLang);
                }
            }
            catch (Exception e){
                e.printStackTrace();
                Toaster.getInstance().error(e.getMessage());
            }
        }
        return result;
    }
}
