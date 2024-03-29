package com.example.dinosaurpark.employee;

import java.time.LocalDate;

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
	private String empPhone;
	private String empAddress;
	private LocalDate empBirth;
	private Integer empWorkYear;

	public Employee(Integer id, String empName, String empPosition, String empDepart, String empEmail, String empPhone,
			String empAddress, LocalDate empBirth, Integer empWorkYear) {

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
