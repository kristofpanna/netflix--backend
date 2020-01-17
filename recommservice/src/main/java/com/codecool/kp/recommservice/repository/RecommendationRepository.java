package com.codecool.kp.recommservice.repository;

import com.codecool.kp.recommservice.entity.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
    List<Recommendation> findAllByVideoId(Long videoId);
}
