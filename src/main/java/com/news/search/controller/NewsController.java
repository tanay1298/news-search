package com.news.search.controller;

import com.news.search.dto.GuardianApiResponse;
import com.news.search.dto.NYTApiResponse;
import com.news.search.dto.NewsResponseDTO;
import com.news.search.helper.NewsResponseMapper;
import com.news.search.service.NewsService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/news")
    @ApiOperation(value = "Fetch news articles based on a keyword",
            notes = "Returns a list of news articles from Guardian and New York Times",
            response = NewsResponseDTO.class)
    public ResponseEntity<NewsResponseDTO> fetchNews(
            @ApiParam(value = "Keyword to search for news articles", required = true)
            @RequestParam String keyword,
            @ApiParam(value = "Page number of results (defaults to 1)", defaultValue = "1")
            @RequestParam int page,
            @ApiParam(value = "Number of articles per page (defaults to 10)", defaultValue = "10")
            @RequestParam int pageSize) {

        // method to fetch news articles from both APIs
        ResponseEntity<GuardianApiResponse> guardianResponse = newsService.fetchNewsFromGuardian(keyword, page, pageSize);
        ResponseEntity<NYTApiResponse> nyTimesResponse = newsService.fetchNewsFromNYTimes(keyword, page);

        // Map the responses to NewsResponseDTO using NewsResponseMapper
        NewsResponseDTO responseDTO = NewsResponseMapper.mapResponses(guardianResponse, nyTimesResponse, keyword, page);

        return ResponseEntity.ok().body(responseDTO);
    }
}
