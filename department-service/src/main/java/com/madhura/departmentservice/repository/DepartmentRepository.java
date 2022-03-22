package com.madhura.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madhura.departmentservice.entity.Department;



@Repository
public interface DepartmentRepository 
extends JpaRepository<Department, Long>{

	Department findDepartmentById(Long departmentId);
}
