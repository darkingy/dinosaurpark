package com.example.dinosaurpark.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/employee")
@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
    @GetMapping("/zookeeper")
    public String zooKeeper(Model model) {
        //TODO 각 모델에 따른 message가 적용되는 것 같지 않은데, 필요하지 않으면 삭제 부탁!
    	model.addAttribute("message", "This is the zookeeper page!");
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "empzookeeper";
    }
    
    @GetMapping("/guide")
    public String guide(Model model) {
    	model.addAttribute("message", "This is the guide page!");
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "empguide";
    }
    
    @GetMapping("/vet")
    public String vet(Model model) {
    	model.addAttribute("message", "This is the vet page!");
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "empvet";
    }
    
    @GetMapping("/security")
    public String security(Model model) {
    	model.addAttribute("message", "This is the security page!");
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "empsecurity";
    }
    
    @GetMapping("/sale")
    public String salery(Model model) {
    	model.addAttribute("message", "This is the salery page!");
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "empsale";
    }
}	