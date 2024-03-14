package com.example.dinosaurpark;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/eden")
    public String list() {
        return "t2";
    }
}
