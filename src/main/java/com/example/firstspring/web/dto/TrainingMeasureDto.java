package com.example.firstspring.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrainingMeasureDto {
    private String name;
    private Date start;
    private Date end;
    private float weeklyHours;

}
