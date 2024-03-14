package com.example.dinosaurpark.dinosaur;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

@Controller
public class DinosaurController {
    
    private final DinosaurService dinosaurService;

    public DinosaurController(DinosaurService dinosaurService) {
        this.dinosaurService = dinosaurService;
    }
    
    @GetMapping("/dinosaurs")
    public String listDinosaurs(Model model) {
        Map<String, List<Dinosaur>> dinosaurMap = dinosaurService.getDinosaursByType();
        model.addAttribute("dinosaurMap", dinosaurMap);
        return "dinosaurList";
    }
    
    @GetMapping(value = "/dinosaurs/details/{id}")
    public String dinosaurDetails(Model model, @PathVariable("id") Integer id) {
        Dinosaur dinosaur = dinosaurService.getDinosaurById(id);
        model.addAttribute("dinosaur", dinosaur);
        return "dinosaur_details";
    }
}