package com.example.dinosaurpark;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/eden")
    public String list() {
        return "demo";
    }

    //루트 디렉터리 localhost:8080만 입력해도 eden 홈페이지로 넘어감
    @GetMapping("/")
    public String root() {
        return "redirect:/eden";
    }
}
