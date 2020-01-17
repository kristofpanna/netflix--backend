package com.codecool.kp.video.controller;

import com.codecool.kp.video.controller.dto.Recommendation;
import com.codecool.kp.video.controller.dto.VideoWithRecommendations;
import com.codecool.kp.video.entity.Video;
import com.codecool.kp.video.service.RecommendationCallerService;
import com.codecool.kp.video.service.VideoService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/video")
public class VideoController {

    @Autowired
    VideoService videoService;

    @Autowired
    RecommendationCallerService recommendationCallerService;


    @GetMapping("/")
    @ApiOperation("List all videos")
    public List<Video> listAllVideos() {
        return videoService.getVideos();
    }


    @GetMapping("/{id}")
    @ApiOperation("Get video details with recommendations by id")
    public VideoWithRecommendations getVideoDetails(@PathVariable Long id) {
        final Video video = videoService.getVideoById(id);
        final List<Recommendation> recommendations = recommendationCallerService.getRecommendations(id);
        return new VideoWithRecommendations(video, recommendations);
    }

}
