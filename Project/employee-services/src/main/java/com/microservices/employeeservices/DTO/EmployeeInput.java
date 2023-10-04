package com.microservices.employeeservices.DTO;

import lombok.Data;

@Data
public class EmployeeInput {
    private String name;
    private String mobile;
    private String address;
    private Long departmentId;
}
