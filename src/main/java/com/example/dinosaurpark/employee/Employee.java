package com.example.dinosaurpark.employee;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
	private LocalDateTime empBirth;
	private Integer empWorkYear;

	public Employee(Integer id, String empName, String empPosition, String empDepart, String empEmail, Integer empPhone,
			String empAddress, LocalDateTime empBirth, Integer empWorkYear) {

		this.id = id;
		this.empName = empName;
		this.empPosition = empPosition;
		this.empDepart = empDepart;
		this.empEmail = empEmail;
		this.empPhone = empPhone;
		this.empAddress = empAddress;
		this.empBirth = empBirth;
		this.empWorkYear = empWorkYear;
	}
}
