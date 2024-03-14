package com.example.dinosaurpark.employee;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private static final List<Employee> EMPLOYEES = Arrays.asList(

			// 1
			new Employee(1, "이재일", "리더", "개발팀", "leader@example.com", 123456789, "서울시 강남구",
					LocalDateTime.of(1990, 5, 15, 0, 0), 5),
			new Employee(2, "윤선용", "개발자", "개발팀", "seonyong@example.com", 987654321, "서울시 강남구",
					LocalDateTime.of(1992, 8, 23, 0, 0), 3),
			new Employee(3, "김민균", "디자이너", "개발팀", "minkyun@example.com", 111222333, "서울시 강남구",
					LocalDateTime.of(1993, 11, 7, 0, 0), 2),
			new Employee(4, "오지현", "마케터", "개발팀", "jihyun@example.com", 444555666, "서울시 강남구",
					LocalDateTime.of(1991, 3, 29, 0, 0), 4),

			// 팀 2
			new Employee(5, "김무원", "리더", "디자인팀", "mowon@example.com", 777888999, "서울시 강서구",
					LocalDateTime.of(1988, 7, 12, 0, 0), 7),
			new Employee(6, "선승화", "디자이너", "디자인팀", "seunghwa@example.com", 222333444, "서울시 강서구",
					LocalDateTime.of(1995, 1, 18, 0, 0), 1),
			new Employee(7, "허지우", "일러스트레이터", "디자인팀", "jihoo@example.com", 555666777, "서울시 강서구",
					LocalDateTime.of(1994, 9, 5, 0, 0), 2),
			new Employee(8, "주영진", "웹디자이너", "디자인팀", "youngjin@example.com", 888999000, "서울시 강서구",
					LocalDateTime.of(1995, 12, 20, 0, 0), 0),

			// 팀 3
			new Employee(9, "백현준", "리더", "마케팅팀", "hyunjune@example.com", 333444555, "서울시 서초구",
					LocalDateTime.of(1987, 4, 3, 0, 0), 8),
			new Employee(10, "성시언", "콘텐츠 크리에이터", "마케팅팀", "sion@example.com", 666777888, "서울시 서초구",
					LocalDateTime.of(1989, 10, 17, 0, 0), 6),
			new Employee(11, "민인홍", "SNS 매니저", "마케팅팀", "inhong@example.com", 999000111, "서울시 서초구",
					LocalDateTime.of(1990, 2, 9, 0, 0), 5),
			new Employee(12, "전영관", "PR 담당자", "마케팅팀", "youngkwan@example.com", 111222333, "서울시 서초구",
					LocalDateTime.of(1986, 6, 21, 0, 0), 9),

			// 팀 4
			new Employee(13, "김태호", "리더", "영업팀", "taeho@example.com", 444555666, "서울시 송파구",
					LocalDateTime.of(1990, 8, 30, 0, 0), 5),
			new Employee(14, "임현빈", "영업 담당자", "영업팀", "hyunbin@example.com", 777888999, "서울시 송파구",
					LocalDateTime.of(1991, 11, 14, 0, 0), 4),
			new Employee(15, "지천배", "마케팅 담당자", "영업팀", "cheonbae@example.com", 222333444, "서울시 송파구",
					LocalDateTime.of(1992, 5, 27, 0, 0), 3),
			new Employee(16, "이다미", "고객지원 담당자", "영업팀", "dami@example.com", 555666777, "서울시 송파구",
					LocalDateTime.of(1993, 9, 8, 0, 0), 2),

			// 팀 5
			new Employee(17, "김수현", "리더", "기획팀", "soohyun@example.com", 111222333, "서울시 마포구",
					LocalDateTime.of(1985, 12, 10, 0, 0), 10),
			new Employee(18, "김범수", "기획자", "기획팀", "beomsoo@example.com", 444555666, "서울시 마포구",
					LocalDateTime.of(1990, 6, 25, 0, 0), 5),
			new Employee(19, "이원재", "마케팅 담당자", "기획팀", "wonjae@example.com", 777888999, "서울시 마포구",
					LocalDateTime.of(1992, 3, 18, 0, 0), 3),
			new Employee(20, "이보겸", "프로덕트 매니저", "기획팀", "bogyum@example.com", 222333444, "서울시 마포구",
					LocalDateTime.of(1993, 8, 7, 0, 0), 2),
			new Employee(21, "박인철", "UI/UX 디자이너", "기획팀", "incheol@example.com", 555666777, "서울시 마포구",
					LocalDateTime.of(1994, 5, 14, 0, 0), 1));

	public List<Employee> getAllEmployees() {
		return EMPLOYEES;
	}
}