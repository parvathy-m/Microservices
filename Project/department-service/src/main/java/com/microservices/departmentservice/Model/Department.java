package com.microservices.departmentservice.Model;

import com.microservices.departmentservice.DTO.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dptName;
    /*@OneToMany(mappedBy = "department")*/
    //private List<Employee> employees;
}
