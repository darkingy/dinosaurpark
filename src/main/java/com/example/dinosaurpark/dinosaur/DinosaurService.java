package com.example.dinosaurpark.dinosaur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class DinosaurService {
	private static final List<Dinosaur> DINOSAURS = Arrays.asList(
			new Dinosaur(1, "티라노사우루스", "Tyrannosaurus rex", "백악기", "수각류", "큰 턱과 발달한 두발로 빠른 속도로 이동", 13.0, 14000.0, 10, 7),
			new Dinosaur(2, "벨로키랍토르", "Velociraptor", "백악기", "수각류", "작고 날카로운 이빨과 발톱으로 사냥", 2.0, 15.0, 8, 8),
            new Dinosaur(3, "스피노사우루스", "Spinosaurus", "백악기", "수각류", "긴 목과 등의 돛 모양의 판", 15.0, 10000.0, 9, 3),
            new Dinosaur(4, "알로사우루스", "Allosaurus", "쥐라기", "수각류", "큰 머리와 이빨로 사냥", 9.0, 3000.0, 8, 6),
            
            new Dinosaur(5, "브라키오사우루스", "Brachiosaurus", "쥐라기", "용각류", "네 다리로 지면에 분산된 몸을 지탱", 25.0, 50000.0, 7, 8),
            new Dinosaur(6, "아파토사우루스", "Apatosaurus", "쥐라기", "용각류", "긴 목과 작은 머리로 식물을 먹음", 23.0, 30000.0, 6, 9),
            new Dinosaur(7, "디플로도쿠스", "Diplodocus", "쥐라기", "용각류", "매우 긴 목과 꼬리", 35.0, 12000.0, 6, 8),
            new Dinosaur(8, "카마라사우루스", "Camarasaurus", "쥐라기", "용각류", "같은 타입에 비해 가벼움", 24.0, 17000.0, 5, 3),

			new Dinosaur(9, "야마케라톱스", "Yamaceratops", "백악기", "각룡류", "작은 뿔과 방패를 가진 작은 각룡류", 2.5, 70.0, 4, 9),
            new Dinosaur(10, "트리케라톱스", "Triceratops", "백악기", "각룡류", "큰 머리에 세 개의 뿔", 9.0, 7000.0, 8, 4),
            new Dinosaur(11, "프로토케라톱스", "Protoceratops", "백악기", "각룡류", "작은 턱에 단일 뿔", 2.0, 150.0, 5, 9),
            new Dinosaur(12, "렙토케라톱스", "Leptoceratops", "백악기", "각룡류", "작고 가벼운 코뿔소류", 2.0, 20.0, 4, 9),

			new Dinosaur(13, "위시사우루스", "Yuxisaurus", "백악기", "조각류", "작은 머리와 큰 눈", 3.5, 180.0, 5, 9),
            new Dinosaur(14, "아무로사우루스", "Amurosaurus", "백악기", "조각류", "긴 목과 작은 머리", 9.0, 2000.0, 6, 8),
            new Dinosaur(15, "파라사우롤로푸스", "Parasaurolophus", "백악기", "조각류", "긴 크레스트를 가진 코뿔소류", 9.0, 3000.0, 6, 8),
            new Dinosaur(16, "이구아노돈", "Iguanodon", "백악기", "조각류", "이족보행보다 사족보행을 즐겨함", 9.5, 3800.0, 8, 2),

            new Dinosaur(17, "안킬로사우루스", "Ankylosaurus", "백악기", "검룡류 ", "몸통 주위에 방패나 돌출된 판", 6.0, 4000.0, 9, 7),
            new Dinosaur(18, "스테고사우루스", "Stegosaurus", "쥐라기", "검룡류 ", "등에 돌출된 돌기와 돌가죽", 9.0, 2500.0, 7, 5),
            new Dinosaur(19, "켄트로사우루스", "Kentrosaurus", "쥐라기", "검룡류", "등에 여러개의 가시가 인상적", 4.2, 1200.0, 8, 8),
            new Dinosaur(20, "투오지앙고사우루스", "Tuojiangosaurus", "쥐라기", "검룡류", "전체적인 체형이 앞으로 쏠려 낮은 키의 식물을 섭취함", 5.7, 2800, 7, 8)            
	    );

	public List<Dinosaur> getAllDinosaurs() {
		return DINOSAURS;
	}
	
	public Dinosaur getDinosaurById(Integer id) {
	    return DINOSAURS.stream()
	            .filter(dinosaur -> id.equals(dinosaur.getId()))
	            .findFirst()
	            .orElse(null);
	}
	
	// 공룡을 종류별로 그룹화하여 맵 형태로 반환하는 메서드
	public Map<String, List<Dinosaur>> getDinosaursByType() {
	    Map<String, List<Dinosaur>> dinosaurMap = new HashMap<>();

	    for (Dinosaur dinosaur : DINOSAURS) {
	        String type = dinosaur.getDinoType();
	        List<Dinosaur> typeList = dinosaurMap.getOrDefault(type, new ArrayList<>());
	        typeList.add(dinosaur);
	        dinosaurMap.put(type, typeList);
	    }

	    return dinosaurMap;
	}
}