package com.example.Liv2Train.service;

import com.example.Liv2Train.model.TrainingCenter;
import com.example.Liv2Train.repository.Liv2TrainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Liv2TrainService{
    private final Liv2TrainRepository liv2trainrepo;

    public Liv2TrainService(Liv2TrainRepository liv2trainrepo){
        this.liv2trainrepo=liv2trainrepo;
    }
    public List<TrainingCenter> getAllCenters(){
        return liv2trainrepo.findAll();
    }
    public TrainingCenter create(TrainingCenter trainingcenter){
        return liv2trainrepo.save(trainingcenter);
    }
}   