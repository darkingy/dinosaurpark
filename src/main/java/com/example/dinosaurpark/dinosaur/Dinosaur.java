package com.example.dinosaurpark.dinosaur;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDinoName() {
        return this.dinoName;
    }

    public void setDinoName(String dinoName) {
        this.dinoName = dinoName;
    }

    public String getDinoSpecies() {
        return this.dinoSpecies;
    }

    public void setDinoSpecies(String dinoSpecies) {
        this.dinoSpecies = dinoSpecies;
    }

    public String getDinoEra() {
        return this.dinoEra;
    }

    public void setDinoEra(String dinoEra) {
        this.dinoEra = dinoEra;
    }

    public String getDinoType() {
        return this.dinoType;
    }

    public void setDinoType(String dinoType) {
        this.dinoType = dinoType;
    }

    public String getDinoFeature() {
        return this.dinoFeature;
    }

    public void setDinoFeature(String dinoFeature) {
        this.dinoFeature = dinoFeature;
    }

    public Double getDinoSize() {
        return this.dinoSize;
    }

    public void setDinoSize(Double dinoSize) {
        this.dinoSize = dinoSize;
    }

    public Double getDinoWeight() {
        return this.dinoWeight;
    }

    public void setDinoWeight(Double dinoWeight) {
        this.dinoWeight = dinoWeight;
    }

    public Integer getDinoDangerLevel() {
        return this.dinoDangerLevel;
    }

    public void setDinoDangerLevel(Integer dinoDangerLevel) {
        this.dinoDangerLevel = dinoDangerLevel;
    }

    public Integer getDinoHealthStatus() {
        return this.dinoHealthStatus;
    }

    public void setDinoHealthStatus(Integer dinoHealthStatus) {
        this.dinoHealthStatus = dinoHealthStatus;
    }
    
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
