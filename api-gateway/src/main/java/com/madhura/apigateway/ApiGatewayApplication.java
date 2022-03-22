package com.madhura.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
@SpringBootApplication
@EnableHystrix
@EnableEurekaClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
		/*
		 http://localhost:9000/departments/
		 http://localhost:9000/departments/1
		  {
	 "departmentName": "IT",
	 "departmentAddress": "India",
	 "departmentCode": "IT"
	 }
	
	 departments
	 http://localhost:9000/employee/
	 http://localhost:9000/employee/1
	 employees
	 {
 "firstName": "madhura",
 "lastName": "maddi",
 "email": "mad@gmail.com",
 "departmentId": "1"
 }
		 */
	}

}
