package com.example.dinosaurpark;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DinosaurService {
	private static final List<Dinosaur> DINOSAURS = Arrays.asList(
			new Dinosaur(1, "렉스", "티라노사우루스", "수각류", "육식", "가장 유명한 티라노사우루스로, 세계에서 가장 강력한 포식자 중 하나로 알려져 있습니다.", 12.3, 9000.0, 10, 5),
			new Dinosaur(2, "테라", "티라노사우루스", "수각류", "육식", "거대한 몸집과 강력한 발톱을 가지고, 숲을 횡단하는 능력이 뛰어납니다.", 13.7, 10100.0, 10, 7),
			
			new Dinosaur(5, "스피드", "벨로키랍토르", "수각류", "육식", "빠른 속도와 민첩성으로 알려진 작은 육식 공룡입니다.", 1.8, 15.0, 8, 5),
	        new Dinosaur(6, "섀도", "벨로키랍토르", "수각류", "육식", "그림자처럼 조용하고 빠르게 이동하는 능력을 지녔습니다.", 1.9, 16.0, 8, 6),

	        new Dinosaur(9, "롱넥", "브라키오사우루스", "용각류", "초식", "긴 목을 이용해 높은 나무의 잎을 먹는 대형 공룡입니다.", 30.0, 50000.0, 3, 9),
	        new Dinosaur(10, "자이언트", "브라키오사우루스", "용각류", "초식", "그 이름처럼 거대한 몸집을 자랑하는 공룡입니다.", 32.0, 55000.0, 3, 9),
	        
	        new Dinosaur(13, "윙마스터", "프테라노돈", "익룡목", "육식", "강력한 날개를 가진 대형 익룡으로, 하늘을 지배했습니다.", 6.0, 250.0, 4, 8),
	        new Dinosaur(14, "에어로", "프테라노돈", "익룡목", "육식", "날카로운 부리로 먹이를 사냥하는 익룡입니다.", 6.2, 230.0, 5, 9),
	        
	        new Dinosaur(17, "마린헌터", "브라카우케니우스", "장경룡목", "육식", "물속에서 뛰어난 속도로 먹이를 추적합니다.", 17.5, 7500.0, 9, 7),
	        new Dinosaur(18, "시헌터", "브라카우케니우스", "장경룡목", "육식", "해저에서 잠복 후 빠르게 공격하는 사냥꾼입니다.", 19.0, 8500.0, 10, 8)	        
	        
			);
	
	public List<Dinosaur> getAllDinosaurs(){
		return DINOSAURS;
	}

}