package com.codecool.kp.recommservice.controller;

import com.codecool.kp.recommservice.model.Recommendation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/recommendation")
public class RecommController {

    @GetMapping("/")
    public List<Recommendation> getAllRecommendations() {
        return new ArrayList<>();
    } //TODO


    @GetMapping("/{videoId}") //TODO @RequestParam
    public List<Recommendation> getRecommendationsForVideo(@PathVariable Long videoId) {
        return new ArrayList<>();
    } // TODO


}
