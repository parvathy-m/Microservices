package com.microservices.departmentservice.Client;

import com.microservices.departmentservice.DTO.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {
    @GetExchange("/employee/api/{id}")
    public List<Employee> getEmp(@PathVariable Long id);
}
