package com.tca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Employee;
import com.tca.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee save(Employee e) {
		
		return employeeRepository.save(e) ;
	}

	@Override
	public Employee findById(Long id) {
		
		return employeeRepository.findById(id).get();
	}

	@Override
	public void remove(Long id) {

      employeeRepository.deleteById(id);

	}

}
