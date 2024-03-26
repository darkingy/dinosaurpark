package com.example.dinosaurpark.dinosaur;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

//RequestMapping으로 공룡 페이지의 베이스가 되는 /dinosaurs가 무조건 앞에 나오게 되므로
//다른 페이지를 매핑할 땐 /dinosaurs는 빼고, 그 뒤에 따르는 매핑만 적용시키면 됨
@RequiredArgsConstructor
@RequestMapping("/dinosaurs")
@Controller
public class DinosaurController {
    
    private final DinosaurRepository dinosaurRepository;

    @GetMapping("/list")
    public String list(Model model) {
        List<Dinosaur> dinosaurList = this.dinosaurRepository.findAll();
        model.addAttribute("dinosaurList", dinosaurList);
        return "dinoList";
    }
}