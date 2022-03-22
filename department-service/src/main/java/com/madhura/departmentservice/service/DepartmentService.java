package com.madhura.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhura.departmentservice.entity.Department;
import com.madhura.departmentservice.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository deparmentRepository;
	public Department save(Department department)
	{
		return deparmentRepository.save(department);
	}
	public Department findDepartmentById(Long id)
	{
		return deparmentRepository.findDepartmentById(id);
	}
}
