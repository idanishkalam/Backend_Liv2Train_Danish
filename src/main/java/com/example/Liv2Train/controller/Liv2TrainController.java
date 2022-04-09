package com.example.Liv2Train.controller;

import com.example.Liv2Train.model.TrainingCenter;
import com.example.Liv2Train.service.Liv2TrainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Liv2TrainController{
    private final Liv2TrainService liv2trainservice;

    public Liv2TrainController(Liv2TrainService liv2trainservice){
        this.liv2trainservice=liv2trainservice;
    }

    @GetMapping("/getAllCenters")
    public List<TrainingCenter> getAllCenters(){
        return liv2trainservice.getAllCenters();
    }

    @PostMapping("/createCenter")
    public TrainingCenter createCenter(@RequestBody TrainingCenter trainingcenter){
        return liv2trainservice.create(trainingcenter);
    }
}