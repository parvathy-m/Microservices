package com.microservices.departmentservice.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    private String name;
    private String mobile;
    /*@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "department_id",nullable = false)
    private Department department;*/
}
