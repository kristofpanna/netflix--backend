package com.codecool.kp.video.service;

import com.codecool.kp.video.controller.dto.Recommendation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
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
        // GET request -> cast response to array of recommendations     // TODO (format string nicer)
        final String url = recommBaseUrl + "?id={id}";
        log.info("== calling restTemplate.getForEntity(url, Recommendation[].class, id) with url: " + url + "   id: " + id);
        final Recommendation[] recomms = restTemplate.getForEntity(url, Recommendation[].class, id).getBody();
        return Arrays.asList(recomms);
    }

    public void saveRecomm(Recommendation newRecomm) {
        HttpEntity<Recommendation> request = new HttpEntity<>(newRecomm);
        URI location = restTemplate.postForLocation(recommBaseUrl, request);
    }


    public void saveRecomms(List<Recommendation> recommendations) {
        for (Recommendation recommendation : recommendations) {
            saveRecomm(recommendation);
        }
    }
}
