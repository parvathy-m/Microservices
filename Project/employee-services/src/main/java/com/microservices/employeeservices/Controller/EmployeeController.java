package com.microservices.employeeservices.Controller;

import com.microservices.employeeservices.DTO.EmployeeInput;
import com.microservices.employeeservices.Model.Employee;
import com.microservices.employeeservices.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee/api/")
@CrossOrigin("*")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @PostMapping("save")
    public void save(@RequestBody EmployeeInput form){
        employeeService.save(form);
    }

    @GetMapping
    public List<Employee> list(){

        return  employeeService.list();
    }
    @GetMapping("{id}")
    public List<Employee> getEmp(@PathVariable Long id){

        return  employeeService.getEmployee(id);
    }

}
