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
		return "employeeProfile";
	}
    
    @GetMapping("/empprofile")
    public String empProfile(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "empzookeeper";
    }
    
    @GetMapping("/customPath/zookeeper")
    public String zooKeeper(Model model) {
    	model.addAttribute("message", "This is the zookeeper page!");
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "empzookeeper";
    }
    
    @GetMapping("/customPath/guide")
    public String guide(Model model) {
    	model.addAttribute("message", "This is the guide page!");
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "empguide";
    }
    
    @GetMapping("/customPath/vet")
    public String vet(Model model) {
    	model.addAttribute("message", "This is the vet page!");
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "empvet";
    }
    
    @GetMapping("/customPath/security")
    public String security(Model model) {
    	model.addAttribute("message", "This is the security page!");
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "empsecurity";
    }
    
    @GetMapping("/customPath/salery")
    public String salery(Model model) {
    	model.addAttribute("message", "This is the salery page!");
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "empsalery";
    }
}	