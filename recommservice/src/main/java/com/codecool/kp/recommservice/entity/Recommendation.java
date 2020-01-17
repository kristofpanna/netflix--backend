package com.codecool.kp.recommservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Recommendation {
    @Id
    @GeneratedValue
    private Long id;

    private Integer rating; // 1-5

    private String comment;

    private Long videoId; // "foreign key"
}
