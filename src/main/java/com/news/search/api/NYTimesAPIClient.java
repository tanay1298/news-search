package com.news.search.api;

import com.news.search.dto.NYTApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NYTimesAPIClient {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${nytimes.api.url}")
    private String nytimesAPIUrl;

    @Value("${nytimes.api.key}")
    private String nytimesAPIKey;

    public ResponseEntity<NYTApiResponse> searchNews(String keyword, int page) {
        String url = nytimesAPIUrl + "/svc/search/v2/articlesearch.json?q=" + keyword + "&api-key=" + nytimesAPIKey + "&page=" + page;
        return restTemplate.getForEntity(url, NYTApiResponse.class);
    }
}
