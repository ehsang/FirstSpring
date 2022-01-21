package com.example.firstspring.service;

import com.example.firstspring.web.dto.TrainingMeasureDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TrainingMeasureServiceImpl  {
    public TrainingMeasureServiceImpl(UtilService utilService) {
        this.utilService = utilService;
    }

    UtilService utilService;

    public List<TrainingMeasureDto> getTrainigMeasures(){

       return utilService.trainingMeasureDtoList();
    }
}
