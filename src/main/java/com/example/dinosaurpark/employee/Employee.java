package com.example.dinosaurpark.employee;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
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
