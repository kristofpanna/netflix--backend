package com.codecool.kp.video.service;

import com.codecool.kp.video.controller.dto.Recommendation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@Service
@Slf4j
public class RecommendationCallerService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${recommservice.url}")
    private String recommBaseUrl;


    public List<Recommendation> getRecommendations(Long id) {
        // GET request -> cast response to array of recommendations
        final Recommendation[] recomms = restTemplate.getForEntity(recommBaseUrl + id, Recommendation[].class).getBody();
        return Arrays.asList(recomms);
    }
}
