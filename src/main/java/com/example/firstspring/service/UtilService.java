package com.example.firstspring.service;

import com.example.firstspring.web.dto.TrainingMeasureDto;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class UtilService {

    public List<TrainingMeasureDto> trainingMeasureDtoList (){
        return List.of(new TrainingMeasureDto("Java", new Date(),new Date(), 78), TrainingMeasureDto
                .builder().name("Python").start(new Date()).end(new Date()).weeklyHours(90).build(), TrainingMeasureDto
                .builder().name("PHP").start(new Date()).end(new Date()).weeklyHours(95).build());

    }
}
