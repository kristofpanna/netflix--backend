package com.codecool.kp.video.controller;

import com.codecool.kp.video.controller.dto.Recommendation;
import com.codecool.kp.video.controller.dto.VideoWithRecommendations;
import com.codecool.kp.video.entity.Video;
import com.codecool.kp.video.service.RecommendationCallerService;
import com.codecool.kp.video.service.VideoService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        log.info("== /video/ endpoint was called");
        return videoService.getVideos();
    }


    @GetMapping("/{id}")
    @ApiOperation("Get a video with recommendations by id")
    public VideoWithRecommendations getVideoDetails(@PathVariable Long id) {
        log.info("== /video/{id} endpoint was called with " + id + " path variable");
        final Video video = videoService.getVideoById(id);
        final List<Recommendation> recommendations = recommendationCallerService.getRecommendations(id);
        return new VideoWithRecommendations(video, recommendations);
    }


    @PostMapping("/")
    @ApiOperation("Update or create a video and its recommendations")
    public void saveVideoWithRecomms(@RequestBody VideoWithRecommendations videoWithRecomms) {
        videoService.saveVideo(videoWithRecomms.getVideo());
        recommendationCallerService.saveRecomms(videoWithRecomms.getRecommendations());
    }

}
