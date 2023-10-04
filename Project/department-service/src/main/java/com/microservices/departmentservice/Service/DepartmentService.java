package com.microservices.departmentservice.Service;

import com.microservices.departmentservice.Client.EmployeeClient;
import com.microservices.departmentservice.DTO.DepartmentInput;
import com.microservices.departmentservice.DTO.DepartmentOutput;
import com.microservices.departmentservice.Model.Department;
import com.microservices.departmentservice.Repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private  final EmployeeClient employeeClient;
    private final DepartmentRepository departmentRepository;

    public void save(DepartmentInput input){
        Department department=new Department();
        department.setDptName(input.getName());
        departmentRepository.save(department);
    }

    public List<Department> list(Long id) {
        System.out.println("Request Received");
        return departmentRepository.findById(id);
    }

    public List<DepartmentOutput> listWithMapping(Long id) {
        System.out.println("Request Received");
        List<Department> departments=departmentRepository.findById(id);
        List<DepartmentOutput> departmentOutputs=new ArrayList<>();
        departments.forEach(department -> {
            DepartmentOutput d=new DepartmentOutput();
            d.setDptName(department.getDptName());
            d.setId(department.getId());
            d.setEmployee(employeeClient.getEmp(department.getId()));
            departmentOutputs.add(d);
        });
        return departmentOutputs;
    }
}
