package com.codecool.kp.recommservice.controller;

import com.codecool.kp.recommservice.model.Recommendation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/recommendation")
public class RecommController {

    @GetMapping("/")
    public List<Recommendation> getAllRecommendationsForVideo(@RequestParam("id") Long videoId) {
        log.info("== /recommendation/ endpoint was called with  " + videoId + " request param");
        return new ArrayList<>(); //TODO
    }


    @GetMapping("/{id}")
    public Recommendation getRecommendation(@PathVariable Long id) {
        log.info("== /recommendation/{id} endpoint was called with " + id + " path variable");
        return new Recommendation(); // TODO
    }


}
