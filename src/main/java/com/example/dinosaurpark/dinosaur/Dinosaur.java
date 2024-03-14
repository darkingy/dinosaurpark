package com.example.dinosaurpark.dinosaur;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
    
    public Dinosaur(Integer id, String dinoName, String dinoSpecies, String dinoEra, String dinoType, String dinoFeature, double dinoSize, double dinoWeight, Integer dinoDangerLevel, Integer dinoHealthStatus) {
    	this.id = id;
        this.dinoName = dinoName;
        this.dinoSpecies = dinoSpecies;
        this.dinoEra = dinoEra;
        this.dinoType = dinoType;
        this.dinoFeature = dinoFeature;
        this.dinoSize = dinoSize;
        this.dinoWeight = dinoWeight;
        this.dinoDangerLevel = dinoDangerLevel;
        this.dinoHealthStatus = dinoHealthStatus;
    }
}
