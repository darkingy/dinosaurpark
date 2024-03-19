package com.example.dinosaurpark.employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private static final List<Employee> EMPLOYEES = Arrays.asList(

			// 1
			new Employee(1, "이재일", "팀장", "사육사팀", "leader@example.com", "(123) 456-789", "서울시 강남구",
					LocalDate.of(1990, 5, 15),
					7),
			new Employee(2, "윤선용", "대리", "사육사팀", "seonyong@example.com", "(987) 654-321", "서울시 강남구",
					LocalDate.of(1992, 8, 23), 5),
			new Employee(3, "김민균", "사원", "사육사팀", "minkyun@example.com", "(111) 222-333", "서울시 강남구",
					LocalDate.of(1993, 11, 7), 2),
			new Employee(4, "오지현", "인턴", "사육사팀", "jihyun@example.com", "(444) 555-666", "서울시 강남구",
					LocalDate.of(1991, 3, 29),
					0),

			// 팀 2
			new Employee(5, "김무원", "전문의", "수의사팀", "moowon@example.com", "(777) 888-999", "서울시 강서구",
					LocalDate.of(1988, 7, 12),
					8),
			new Employee(6, "선승화", "전공의", "수의사팀", "seunghwa@example.com", "(222) 333-444", "서울시 강서구",
					LocalDate.of(1995, 1, 18), 5),
			new Employee(7, "허지우", "수련의", "수의사팀", "jihoo@example.com", "(555) 666-777", "서울시 강서구",
					LocalDate.of(1994, 9, 5), 4),
			new Employee(8, "주영진", "인턴", "수의사팀", "youngjin@example.com", "(888) 999-000", "서울시 강서구",
					LocalDate.of(1995, 12, 20), 0),

			// 팀 3
			new Employee(9, "백현준", "팀장", "보안팀", "hyunjune@example.com", "(333) 444-555", "서울시 서초구",
					LocalDate.of(1987, 4, 3),
					12),
			new Employee(10, "성시언", "차장", "보안팀", "sion@example.com", "(666) 777-888", "서울시 서초구",
					LocalDate.of(1989, 10, 17), 9),
			new Employee(11, "민인홍", "대리", "보안팀", "inhong@example.com", "(999) 000-111", "서울시 서초구",
					LocalDate.of(1990, 2, 9), 5),
			new Employee(12, "전영관", "인턴", "보안팀", "youngkwan@example.com", "(111) 222-333", "서울시 서초구",
					LocalDate.of(1986, 6, 21), 0),

			// 팀 4
			new Employee(13, "김태호", "팀장", "영업팀", "taeho@example.com", "(444) 555-666", "서울시 송파구",
					LocalDate.of(1990, 8, 30),
					7),
			new Employee(14, "임현빈", "대리", "영업팀", "hyunbin@example.com", "(777) 888-999", "서울시 송파구",
					LocalDate.of(1991, 11, 14), 4),
			new Employee(15, "지천배", "사원", "영업팀", "cheonbae@example.com", "(222) 333-444", "서울시 송파구",
					LocalDate.of(1992, 5, 27), 3),
			new Employee(16, "이다미", "인턴", "영업팀", "dami@example.com", "(555) 666-777", "서울시 송파구",
					LocalDate.of(1993, 9, 8), 0),

			// 팀 5
			new Employee(17, "김수현", "팀장", "가이드팀", "soohyun@example.com", "(111) 222-333", "서울시 마포구",
					LocalDate.of(1985, 12, 10), 10),
			new Employee(18, "김범수", "과장", "가이드팀", "beomsoo@example.com", "(444) 555-666", "서울시 마포구",
					LocalDate.of(1990, 6, 25), 7),
			new Employee(19, "이원재", "대리", "가이드팀", "wonjae@example.com", "(777) 888-999", "서울시 마포구",
					LocalDate.of(1992, 3, 18), 3),
			new Employee(20, "이보겸", "사원", "가이드팀", "bogyum@example.com", "(222) 333-444", "서울시 마포구",
					LocalDate.of(1993, 8, 7), 2),
			new Employee(21, "박인철", "인턴", "가이드팀", "incheol@example.com", "(555) 666-777", "서울시 마포구",
					LocalDate.of(1994, 5, 14), 0));

	public List<Employee> getAllEmployees() {
		return EMPLOYEES;
	}

	public Employee getEmployeeById(Integer id) {
		return EMPLOYEES.stream()
				.filter(employee -> id.equals(employee.getId()))
				.findFirst()
				.orElse(null);
	}

	public Map<String, List<Employee>> getEmployeeByType() {
		Map<String, List<Employee>> employeeMap = new HashMap<>();

		for (Employee employee : EMPLOYEES) {
			String emptype = employee.getEmpDepart();
			List<Employee> emptypeList = employeeMap.getOrDefault(emptype, new ArrayList<>());
			emptypeList.add(employee);
			employeeMap.put(emptype, emptypeList);
		}

		return employeeMap;
	}
}