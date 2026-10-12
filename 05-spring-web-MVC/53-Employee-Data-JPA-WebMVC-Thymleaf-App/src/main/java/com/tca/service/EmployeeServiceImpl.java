package com.tca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tca.entity.Employee;
import com.tca.repository.EmployeeRepository;

@Component("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> fetchAll() {
		
		return  employeeRepository.findAll();
		
		
	}

}
