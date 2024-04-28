package com.news.search.api;

import com.news.search.dto.GuardianApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GuardianAPIClient {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${guardian.api.url}")
    private String guardianAPIUrl;

    @Value("${guardian.api.key}")
    private String guardianAPIKey;

    public ResponseEntity<GuardianApiResponse> searchNews(String keyword, int page, int pageSize) {
        String url = guardianAPIUrl + "/search?q=" + keyword + "&api-key=" + guardianAPIKey + "&page=" + page + "&page-size=" + pageSize;
        return restTemplate.getForEntity(url, GuardianApiResponse.class);
    }
}
