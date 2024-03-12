package com.example.dinosaurpark;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Employee {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String empName;
	private String empPosition;
	private String empDepart;
	private String empEmail;
	private Integer empPhone;
	private String empAddress;
	private LocalDateTime empEmpDate;
	private LocalDateTime empBirth;
	private Integer empWorkYear;
}
