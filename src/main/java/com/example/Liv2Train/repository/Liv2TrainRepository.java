package com.example.Liv2Train.repository;

import com.example.Liv2Train.model.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Liv2TrainRepository extends JpaRepository<TrainingCenter, String> {
}