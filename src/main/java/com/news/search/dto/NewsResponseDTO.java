package com.news.search.dto;

import java.util.List;

public class NewsResponseDTO {
    private String newsWebsite;
    private List<String> articleUrls;
    private List<String> articleDescriptions;
    private String keyword;
    private int pageNoRetrieved;
    private int previousPageNo;
    private int nextPageNo;
    private long timeTakenInMillis;

    public NewsResponseDTO() {

    }

    public String getNewsWebsite() {
        return newsWebsite;
    }

    public void setNewsWebsite(String newsWebsite) {
        this.newsWebsite = newsWebsite;
    }

    public List<String> getArticleUrls() {
        return articleUrls;
    }

    public void setArticleUrls(List<String> articleUrls) {
        this.articleUrls = articleUrls;
    }

    public List<String> getArticleDescriptions() {
        return articleDescriptions;
    }

    public void setArticleDescriptions(List<String> articleDescriptions) {
        this.articleDescriptions = articleDescriptions;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getPageNoRetrieved() {
        return pageNoRetrieved;
    }

    public void setPageNoRetrieved(int pageNoRetrieved) {
        this.pageNoRetrieved = pageNoRetrieved;
    }

    public int getPreviousPageNo() {
        return previousPageNo;
    }

    public void setPreviousPageNo(int previousPageNo) {
        this.previousPageNo = previousPageNo;
    }

    public int getNextPageNo() {
        return nextPageNo;
    }

    public void setNextPageNo(int nextPageNo) {
        this.nextPageNo = nextPageNo;
    }

    public long getTimeTakenInMillis() {
        return timeTakenInMillis;
    }

    public void setTimeTakenInMillis(long timeTakenInMillis) {
        this.timeTakenInMillis = timeTakenInMillis;
    }
}
