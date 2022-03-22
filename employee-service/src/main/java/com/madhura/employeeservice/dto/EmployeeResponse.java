package com.madhura.employeeservice.dto;

import com.madhura.employeeservice.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
private Employee employee;
private Department deparment;



}
