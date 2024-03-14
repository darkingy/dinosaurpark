package com.example.dinosaurpark.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public String showEmployeeList(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employeeList";
    }
    
    @GetMapping(value = "/employees/details/{id}")
	public String employeeDetails(Model model, @PathVariable("id") Integer id) {
	    Employee employee = employeeService.getEmployeeById(id);
	    model.addAttribute("employee", employee);
		return "employee_details";
	}
}