package com.tca.service;

import java.util.List;

import com.tca.entity.Employee;

public interface EmployeeService {

	public Employee fetchEmployeeById(Integer id);
	
	public List<Employee> fetchEmployees();
	
	public Employee addEmployee(Employee emp);

}
