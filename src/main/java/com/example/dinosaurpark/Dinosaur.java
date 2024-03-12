package com.example.dinosaurpark;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Dinosaur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String dinoName;
    private String dinoSpecies;
    private String dinoEra;
    private String dinoType;
    private String dinoFeature;
    private Double dinoSize;
    private Double dinoWeight;
    private Integer dinoDangerLevel; 
    private Integer dinoHealthStatus;
}
