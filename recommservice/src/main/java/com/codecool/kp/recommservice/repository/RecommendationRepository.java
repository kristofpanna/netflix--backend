package com.codecool.kp.recommservice.repository;

import com.codecool.kp.recommservice.entity.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
}
