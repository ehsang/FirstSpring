package com.example.firstspring.web.controller;

import com.example.firstspring.service.TrainingMeasureServiceImpl;
import com.example.firstspring.web.dto.TrainingMeasureDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainingMeasureResource {
    public TrainingMeasureResource(TrainingMeasureServiceImpl trainingMeasureService) {
        this.trainingMeasureService = trainingMeasureService;
    }

    TrainingMeasureServiceImpl trainingMeasureService;
    @GetMapping("/training-measure")
    public List<TrainingMeasureDto> getAll(){
        return trainingMeasureService.getTrainigMeasures();
    }
}
