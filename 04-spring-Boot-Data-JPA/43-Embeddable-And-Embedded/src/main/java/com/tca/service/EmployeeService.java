package com.tca.service;

import com.tca.entity.Employee;

public interface EmployeeService {
	
	 public Employee save(Employee e);
	 
	 public Employee findById(Long id);
	 
	 public void remove(Long id);

}
