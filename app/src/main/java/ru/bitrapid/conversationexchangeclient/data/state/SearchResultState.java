package ru.bitrapid.conversationexchangeclient.data.state;


import ru.bitrapid.conversationexchangeclient.data.model.SearchResult;

public class SearchResultState {
    private static SearchResultState instance;
    public static SearchResultState getInstance(){
        if(instance == null){
            instance = new SearchResultState();
        }
        return instance;
    }
    private SearchResultState(){}


    private SearchResult searchResult;

    public SearchResult getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(SearchResult searchResult) {
        this.searchResult = searchResult;
    }
}
