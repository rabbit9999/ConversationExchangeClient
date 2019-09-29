package ru.bitrapid.conversationexchangeclient.data.model;

import java.util.List;

public class SearchResult {
    private Integer getFirstNavPage;
    private String getFirstPageUrl;
    private String getLastPageUrl;
    private Integer getMaxNavPages;
    private String getNextPageUrl;
    private String getPrevPageUrl;
    private String getQueryString;
    private Integer getTotalPages;
    private Boolean isFirstPage;
    private Boolean isLastPage;
    private List<SearchResultRecord> records;
    private Integer thisPgNumber;
    private Integer totalRows;

    public Integer getGetFirstNavPage() {
        return getFirstNavPage;
    }

    public void setGetFirstNavPage(Integer getFirstNavPage) {
        this.getFirstNavPage = getFirstNavPage;
    }

    public String getGetFirstPageUrl() {
        return getFirstPageUrl;
    }

    public void setGetFirstPageUrl(String getFirstPageUrl) {
        this.getFirstPageUrl = getFirstPageUrl;
    }

    public String getGetLastPageUrl() {
        return getLastPageUrl;
    }

    public void setGetLastPageUrl(String getLastPageUrl) {
        this.getLastPageUrl = getLastPageUrl;
    }

    public Integer getGetMaxNavPages() {
        return getMaxNavPages;
    }

    public void setGetMaxNavPages(Integer getMaxNavPages) {
        this.getMaxNavPages = getMaxNavPages;
    }

    public String getGetNextPageUrl() {
        return getNextPageUrl;
    }

    public void setGetNextPageUrl(String getNextPageUrl) {
        this.getNextPageUrl = getNextPageUrl;
    }

    public String getGetPrevPageUrl() {
        return getPrevPageUrl;
    }

    public void setGetPrevPageUrl(String getPrevPageUrl) {
        this.getPrevPageUrl = getPrevPageUrl;
    }

    public String getGetQueryString() {
        return getQueryString;
    }

    public void setGetQueryString(String getQueryString) {
        this.getQueryString = getQueryString;
    }

    public Integer getGetTotalPages() {
        return getTotalPages;
    }

    public void setGetTotalPages(Integer getTotalPages) {
        this.getTotalPages = getTotalPages;
    }

    public Boolean getFirstPage() {
        return isFirstPage;
    }

    public void setFirstPage(Boolean firstPage) {
        isFirstPage = firstPage;
    }

    public Boolean getLastPage() {
        return isLastPage;
    }

    public void setLastPage(Boolean lastPage) {
        isLastPage = lastPage;
    }

    public List<SearchResultRecord> getRecords() {
        return records;
    }

    public void setRecords(List<SearchResultRecord> records) {
        this.records = records;
    }

    public Integer getThisPgNumber() {
        return thisPgNumber;
    }

    public void setThisPgNumber(Integer thisPgNumber) {
        this.thisPgNumber = thisPgNumber;
    }

    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
    }
}
