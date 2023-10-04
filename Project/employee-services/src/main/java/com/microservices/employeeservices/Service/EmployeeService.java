package com.microservices.employeeservices.Service;

import com.microservices.employeeservices.DTO.EmployeeInput;
import com.microservices.employeeservices.Model.Employee;
import com.microservices.employeeservices.Repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public void save(EmployeeInput input){
        Employee emp=new Employee();
        emp.setAddress(input.getAddress());
        emp.setName(input.getName());
        emp.setMobile(input.getMobile());
        emp.setDepartmentId(input.getDepartmentId());
        employeeRepository.save(emp);
    }

    public List<Employee> list() {
        System.out.println("Request Received");
        return employeeRepository.findAll();
    }

    public List<Employee> getEmployee(Long id) {
        return employeeRepository.findByDepartmentId(id);
    }
}
