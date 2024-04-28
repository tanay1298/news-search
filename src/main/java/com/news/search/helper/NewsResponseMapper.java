package com.news.search.helper;


import com.news.search.dto.GuardianApiResponse;
import com.news.search.dto.NYTApiResponse;
import com.news.search.dto.NewsResponseDTO;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class NewsResponseMapper {

    public static NewsResponseDTO mapResponses(ResponseEntity<GuardianApiResponse> guardianResponse,
            ResponseEntity<NYTApiResponse> nyTimesResponse,
            String keyword,
            Integer page) {
        NewsResponseDTO responseDTO = new NewsResponseDTO();
        responseDTO.setNewsWebsite("Guardian & NY Times");

        List<String> articleUrls = new ArrayList<>();
        List<String> articleDescriptions = new ArrayList<>();

        // Process Guardian response
        GuardianApiResponse guardianData = guardianResponse.getBody();
        for (GuardianApiResponse.Result result : guardianData.getResponse().getResults()) {
            articleUrls.add(result.getWebUrl());
            articleDescriptions.add(result.getWebTitle());
        }

        // Process NY Times response
        NYTApiResponse nyTimesData = nyTimesResponse.getBody();
        for (NYTApiResponse.Article article : nyTimesData.getResponse().getDocs()) {
            articleUrls.add(article.getWebUrl());
            articleDescriptions.add(article.getAbstractText());
        }

        responseDTO.setArticleUrls(articleUrls);
        responseDTO.setArticleDescriptions(articleDescriptions);
        responseDTO.setKeyword(keyword);
        responseDTO.setPageNoRetrieved(page);
        responseDTO.setPreviousPageNo(page >= 1 ? page-1 : 0);
        responseDTO.setNextPageNo(page+1);
        responseDTO.setTimeTakenInMillis(nyTimesData.getResponse().getMeta().getTime());

        return responseDTO;
    }
}


