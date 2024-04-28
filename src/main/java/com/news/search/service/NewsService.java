package com.news.search.service;

import com.news.search.api.GuardianAPIClient;
import com.news.search.api.NYTimesAPIClient;
import com.news.search.dto.GuardianApiResponse;
import com.news.search.dto.NYTApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class NewsService {

    @Autowired
    private GuardianAPIClient guardianAPIClient;

    @Autowired
    private NYTimesAPIClient nyTimesAPIClient;

    public ResponseEntity<GuardianApiResponse> fetchNewsFromGuardian(String keyword, int page, int pageSize) {
        return guardianAPIClient.searchNews(keyword, page, pageSize);
    }

    public ResponseEntity<NYTApiResponse> fetchNewsFromNYTimes(String keyword, int page) {
        return nyTimesAPIClient.searchNews(keyword, page);
    }
}
