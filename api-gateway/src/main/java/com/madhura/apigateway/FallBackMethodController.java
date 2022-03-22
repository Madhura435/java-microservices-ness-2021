package com.madhura.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/EmployeeServiceFallBack")
	public String userServiceFallBackMethod()
	{
		return "Employee service is taking longer than excepted. please try again later";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod()
	{
		return "Department service is taking longer than excepted. please try again later";
	}
	
}
