package com.madhura.employeeservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.madhura.employeeservice.dto.Department;
import com.madhura.employeeservice.dto.EmployeeResponse;
import com.madhura.employeeservice.entity.Employee;
import com.madhura.employeeservice.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService {

@Autowired
private EmployeeRepository employeeRepository;

@Autowired
private RestTemplate restTemplate;



public Employee saveEmployee(@RequestBody Employee employee)
{
	return employeeRepository.save(employee);
}


public EmployeeResponse findEmployeeById(Long id)
{
	EmployeeResponse employeeresponse=new EmployeeResponse();
	Employee employee=employeeRepository.findEmployeeById(id);
	Department department=restTemplate.getForObject
			("http://DEPARTMENT-SERVICE/departments/"+employee.getDepartmentId(), Department.class);
	employeeresponse.setEmployee(employee);
	employeeresponse.setDeparment(department);
	return employeeresponse;

}
}



