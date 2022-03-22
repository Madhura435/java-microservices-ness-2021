package com.madhura.departmentservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhura.departmentservice.entity.Department;
import com.madhura.departmentservice.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;



@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
@Autowired
private DepartmentService service;

@PostMapping("/")
public Department saveDepartmet(@RequestBody Department department)
{
	return service.save(department);
}

@GetMapping("/{id}")
public Department findDepartmentById(@PathVariable Long id)
{
	return service.findDepartmentById(id);
}
}
