package com.microservices.departmentservice.DTO;

import lombok.Data;

@Data
public class Employee {
    private Long empId;
    private String name;
    private String mobile;
    private String address;
    private Long departmentId;
}
