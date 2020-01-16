package com.codecool.kp.video;

import com.codecool.kp.video.entity.Video;
import com.codecool.kp.video.repository.VideoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private VideoRepository videoRepository;

    @Override
    public void run(String... args) throws Exception {
        Video video1 = Video.builder()
                .name("The Mandalorian soundtrack")
                .url("https://www.youtube.com/watch?v=V7yqW64Dx7c")
                .build();
        videoRepository.save(video1);

        Video video2 = Video.builder()
                .name("One Step Forward by Kitti")
                .url("https://www.youtube.com/watch?v=uKthisLCFD4")
                .build();
        videoRepository.save(video2);

        Video video3 = Video.builder()
                .name("Quck Sort - legényes")
                .url("https://www.youtube.com/watch?v=ywWBy6J5gz8")
                .build();
        videoRepository.save(video3);

        Video video4 = Video.builder()
                .name("!!Con 2019- Tail Call Optimization: The Musical!! by Anjana Vakil & Natalia Margolis")
                .url("https://www.youtube.com/watch?v=-PX0BV9hGZY")
                .build();
        videoRepository.save(video4);

        Video video5 = Video.builder()
                .name("Microservices #2")
                .url("https://www.youtube.com/watch?v=APQgg7gDrfg&t=53s")
                .build();
        videoRepository.save(video5);

    }
}
