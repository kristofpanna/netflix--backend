package com.codecool.kp.video.service;

import com.codecool.kp.video.entity.Video;
import com.codecool.kp.video.repository.VideoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public List<Video> getVideos() {
        return videoRepository.findAll();
    }

    public Video getVideoById(Long id) {
        return videoRepository.getOne(id);
    }


    public void saveVideo(Video video) {
        videoRepository.save(video);
    }
}
