package com.codecool.kp.video.repository;

import com.codecool.kp.video.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
    Video getByName(String name);
}
