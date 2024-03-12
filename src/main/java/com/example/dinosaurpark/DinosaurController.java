package com.example.dinosaurpark;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DinosaurController {
    
    @GetMapping("/dino")
    @ResponseBody
    public String index() {
        return "<h2>안녕-1</h2>";
    }
}
