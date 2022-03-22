package com.madhura.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhura.employeeservice.dto.EmployeeResponse;
import com.madhura.employeeservice.entity.Employee;
import com.madhura.employeeservice.services.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

@Autowired	
private EmployeeService employeeService;

@PostMapping("/")
public Employee saveEmployee(@RequestBody Employee employee)
{
	return employeeService.saveEmployee(employee);
}

@GetMapping("/madhura")
public String get()
{
return "madhura";	
}

@GetMapping("/{id}")
public EmployeeResponse findEmployeeById(@PathVariable("id") Long id)
{
	return employeeService.findEmployeeById(id);
}


}
