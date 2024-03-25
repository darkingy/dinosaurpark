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

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPosition() {
		return this.empPosition;
	}

	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}

	public String getEmpDepart() {
		return this.empDepart;
	}

	public void setEmpDepart(String empDepart) {
		this.empDepart = empDepart;
	}

	public String getEmpEmail() {
		return this.empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPhone() {
		return this.empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpAddress() {
		return this.empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public LocalDate getEmpBirth() {
		return this.empBirth;
	}

	public void setEmpBirth(LocalDate empBirth) {
		this.empBirth = empBirth;
	}

	public Integer getEmpWorkYear() {
		return this.empWorkYear;
	}

	public void setEmpWorkYear(Integer empWorkYear) {
		this.empWorkYear = empWorkYear;
	}

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
