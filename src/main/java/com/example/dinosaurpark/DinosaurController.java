package com.example.dinosaurpark;

//프로젝트 내 필요한 클래스 임포트
import com.example.dinosaurpark.Dinosaur;

//스프링부트 라이브러리 임포트
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

//자바 라이브러리 임포트
import java.util.ArrayList;
import java.util.List;

@Controller
public class DinosaurController {
    
    @GetMapping("/dino")
    public String listDinosaurs(Model model) {
        List<Dinosaur> dinosaurs = createDinosaurs();
        model.addAttribute("dinosaurs", dinosaurs);
        return "dinosaurList";
    }

    private List<Dinosaur> createDinosaurs() {
        List<Dinosaur> dinosaurs = new ArrayList<>();
        dinosaurs.add(new Dinosaur("Tyrannosaurus", "Type 1"));
        dinosaurs.add(new Dinosaur("Triceratops", "Type 2"));
        //필요한 공룡 더 추가하기

        return dinosaurs;
    }
}
