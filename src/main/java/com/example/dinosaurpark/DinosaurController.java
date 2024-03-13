package com.example.dinosaurpark;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DinosaurController {
    
	private final DinosaurService dinosaurService;

	public DinosaurController(DinosaurService dinosaurService) {
		this.dinosaurService = dinosaurService;
	}
	
	@GetMapping("/dinosaurs")
	public String listDinosaurs(Model model) {
		List<Dinosaur> dinosaurs = dinosaurService.getAllDinosaurs();
		model.addAttribute("dinosaurs", dinosaurs);
		return "dinosaurList";
	}
}
