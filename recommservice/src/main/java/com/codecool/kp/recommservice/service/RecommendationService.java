package com.codecool.kp.recommservice.service;

import com.codecool.kp.recommservice.entity.Recommendation;
import com.codecool.kp.recommservice.repository.RecommendationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RecommendationService {

    @Autowired
    RecommendationRepository recommendationRepository;

    public void saveRecommendation(Recommendation recommendation) {
        recommendationRepository.save(recommendation);
    }
}
