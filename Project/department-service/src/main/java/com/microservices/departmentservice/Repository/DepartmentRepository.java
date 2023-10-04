package com.microservices.departmentservice.Repository;

import com.microservices.departmentservice.Model.Department;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface DepartmentRepository extends Repository<Department,Long> {

    void save(Department department);

    List<Department> findById(Long id);
}
