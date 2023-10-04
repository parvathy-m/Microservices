package com.microservices.departmentservice.DTO;



import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentOutput {
    private Long id;
    private String dptName;
    private List<Employee> employee;
}
