package com.codecool.kp.video.controller.dto;

import com.codecool.kp.video.entity.Video;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class VideoWithRecommendations {
    private Video video;
    private List<Recommendation> recommendations;
}
