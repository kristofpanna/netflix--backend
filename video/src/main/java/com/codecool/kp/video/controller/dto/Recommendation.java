package com.codecool.kp.video.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Recommendation {
    private Long id;
    private Integer rating; // 1-5
    private String comment;
    private Long videoId;
}
