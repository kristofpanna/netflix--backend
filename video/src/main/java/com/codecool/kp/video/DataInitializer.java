package com.codecool.kp.video;

import com.codecool.kp.video.controller.dto.Recommendation;
import com.codecool.kp.video.entity.Video;
import com.codecool.kp.video.repository.VideoRepository;
import com.codecool.kp.video.service.RecommendationCallerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private VideoRepository videoRepository;

    @Autowired
    private RecommendationCallerService recommCaller;

    @Override
    public void run(String... args) throws Exception {
        Video video1 = Video.builder()
                .name("The Mandalorian soundtrack")
                .url("https://www.youtube.com/embed/V7yqW64Dx7c")
                .build();
        final Long vieo1Id = videoRepository.save(video1).getId();
        Recommendation recommendation11 = Recommendation.builder()
                .rating(4)
                .comment("Baby Yoda for President!")
                .videoId(vieo1Id)
                .build();
        recommCaller.saveRecomm(recommendation11);
        Recommendation recommendation12 = Recommendation.builder()
                .rating(5)
                .comment("Baby Yoda for President! Again!!!")
                .videoId(vieo1Id)
                .build();
        recommCaller.saveRecomm(recommendation12);
        Recommendation recommendation13 = Recommendation.builder()
                .rating(3)
                .comment("Nice music for coding.")
                .videoId(vieo1Id)
                .build();
        recommCaller.saveRecomm(recommendation13);

        Video video2 = Video.builder()
                .name("One Step Forward by Kitti")
                .url("https://www.youtube.com/embed/uKthisLCFD4")
                .build();
        final Long vieo2Id = videoRepository.save(video2).getId();
        Recommendation recommendation21 = Recommendation.builder()
                .rating(5)
                .comment("Best song ever! <3")
                .videoId(vieo2Id)
                .build();
        recommCaller.saveRecomm(recommendation21);
        Recommendation recommendation22 = Recommendation.builder()
                .rating(5)
                .comment("Great video.")
                .videoId(vieo2Id)
                .build();
        recommCaller.saveRecomm(recommendation22);

        Video video3 = Video.builder()
                .name("Quck Sort - legényes")
                .url("https://www.youtube.com/embed/ywWBy6J5gz8")
                .build();
        final Long vieo3Id = videoRepository.save(video3).getId();
        Recommendation recommendation31 = Recommendation.builder()
                .rating(3)
                .comment("Great visualization, although a bit slow for understanding the algorithm.")
                .videoId(vieo3Id)
                .build();
        recommCaller.saveRecomm(recommendation31);



        Video video4 = Video.builder()
                .name("!!Con 2019- Tail Call Optimization: The Musical!! by Anjana Vakil & Natalia Margolis")
                .url("https://www.youtube.com/embed/-PX0BV9hGZY")
                .build();
        final Long vieo4Id = videoRepository.save(video4).getId();
        Recommendation recommendation41 = Recommendation.builder()
                .rating(4)
                .comment("Second best tutorial video ever! <3 <3 <3")
                .videoId(vieo4Id)
                .build();
        recommCaller.saveRecomm(recommendation41);

        Video video5 = Video.builder()
                .name("Microservices #2")
                .url("https://www.youtube.com/embed/APQgg7gDrfg")
                .build();
        final Long vieo5Id = videoRepository.save(video5).getId();
        Recommendation recommendation51 = Recommendation.builder()
                .rating(5)
                .comment("Best tutorial video ever!")
                .videoId(vieo5Id)
                .build();
        recommCaller.saveRecomm(recommendation51);
        Recommendation recommendation52 = Recommendation.builder()
                .rating(5)
                .comment("Watched these all week.")
                .videoId(vieo5Id)
                .build();
        recommCaller.saveRecomm(recommendation52);


    }
}
