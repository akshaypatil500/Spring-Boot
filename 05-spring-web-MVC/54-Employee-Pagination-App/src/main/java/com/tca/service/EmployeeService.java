package com.tca.service;

import org.springframework.data.domain.Page;

import com.tca.entity.Employee;

public interface EmployeeService {
	
	 public Page<Employee> fetchAll(int pageNumber,int pageSize);

}
