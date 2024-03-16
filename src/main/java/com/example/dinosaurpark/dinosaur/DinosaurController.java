package com.example.dinosaurpark.dinosaur;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//RequestMapping으로 공룡 페이지의 베이스가 되는 /dinosaurs가 무조건 앞에 나오게 되므로
//다른 페이지를 매핑할 땐 /dinosaurs는 빼고, 그 뒤에 따르는 매핑만 적용시키면 됨
@RequestMapping("/dinosaurs")
@Controller
public class DinosaurController {
    
    private final DinosaurService dinosaurService;

    public DinosaurController(DinosaurService dinosaurService) {
        this.dinosaurService = dinosaurService;
    }
    
    //예를 들어, 이페이지는 이제 자동으로 /dinosaurs/type/{type}으로 넘어가짐
    @GetMapping(value = "/type/{type}")
    public String listDinosaursByType(Model model, @PathVariable("type") String type) {
        List<Dinosaur> dinosaurs = dinosaurService.getDinosaursByType().get(type);
        model.addAttribute("dinosaurs", dinosaurs); // 공룡 정보를 모델에 추가
        model.addAttribute("type", type); // 공룡 종류를 모델에 추가
        return "dinosaurListByType"; // 정보 페이지로 이동
    }
}