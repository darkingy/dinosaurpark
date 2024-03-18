package com.example.dinosaurpark.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/employee")
@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/empdepart/{emptype}")
    public String empProfile(Model model, @PathVariable("emptype") String emptype) {
        List<Employee> employees = employeeService.getEmployeeByType().get(emptype);
        model.addAttribute("employees", employees);
        model.addAttribute("emptype", emptype);
        return "empProfile";
    }
}