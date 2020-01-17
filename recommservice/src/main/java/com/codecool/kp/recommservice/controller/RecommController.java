package com.codecool.kp.recommservice.controller;

import com.codecool.kp.recommservice.entity.Recommendation;
import com.codecool.kp.recommservice.service.RecommendationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/recommendation")
public class RecommController {

    @Autowired
    RecommendationService recommendationService;

    @GetMapping("/")
    public List<Recommendation> getAllRecommendationsForVideo(@RequestParam("id") Long videoId) {
        log.info("== /recommendation/ endpoint was called with  " + videoId + " request param");
        return recommendationService.getRecommendationsForVideo(videoId);
    }

    @PostMapping("/")
    public void saveRecommendation(@RequestBody Recommendation recommendation) {
        log.info("== /recommendation/ endpoint was called with POST request");
        log.info("== recommendation to save: " + recommendation);
        recommendationService.saveRecommendation(recommendation);
    }

}
