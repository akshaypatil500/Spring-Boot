package com.tca.service;

import java.util.List;
import java.util.Map;

import com.tca.entity.Employee;

public interface EmployeeService {

	public Employee fetchEmployeeById(Integer id);
	
	public List<Employee> fetchEmployees();
	
	public Employee addEmployee(Employee emp);
	
	public boolean removeEmployee(Integer id);
	
	public Employee updateEmployee(Employee emp);
	
	public Employee updateEmployeeById(Map<String,Object > fieldMap,Integer id);

}
