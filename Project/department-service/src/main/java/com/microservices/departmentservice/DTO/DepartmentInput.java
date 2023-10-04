package com.microservices.departmentservice.DTO;

import com.microservices.departmentservice.Model.Employee;
import lombok.Data;

import java.util.List;

@Data
public class DepartmentInput {
    private String name;
    private List<Employee> employee;
}
