package com.microservices.departmentservice.Controller;

import com.microservices.departmentservice.DTO.DepartmentInput;
import com.microservices.departmentservice.DTO.DepartmentOutput;
import com.microservices.departmentservice.Model.Department;
import com.microservices.departmentservice.Model.Employee;
import com.microservices.departmentservice.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department/api/")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;
    @PostMapping("save")
    private void saveDepartment(@RequestBody DepartmentInput form){
        departmentService.save(form);
    }

    @GetMapping("{id}")
    private List<Department> list(@PathVariable Long id){
        return  departmentService.list(id);
    }

    @GetMapping("with-employee/{id}")
    private List<DepartmentOutput> listMapping(@PathVariable Long id){
        return  departmentService.listWithMapping(id);
    }

}
