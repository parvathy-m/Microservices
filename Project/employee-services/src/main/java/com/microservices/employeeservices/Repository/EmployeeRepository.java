package com.microservices.employeeservices.Repository;

import com.microservices.employeeservices.Model.Employee;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface EmployeeRepository extends Repository<Employee,Long> {

    void save(Employee department);

    List<Employee> findById(Long id);

    List<Employee> findAll();

    List<Employee> findByDepartmentId(Long id);
}
