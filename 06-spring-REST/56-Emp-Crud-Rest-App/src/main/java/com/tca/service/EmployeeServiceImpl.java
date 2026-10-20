package com.tca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Employee;
import com.tca.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee fetchEmployeeById(Integer id) {
		
		Optional<Employee> opt= employeeRepository.findById(id);
		
		if(opt.isPresent()) {
			
			return opt.get();
		}
		else {
			return null;
		}
		
	}

	@Override
	public List<Employee> fetchEmployees() {
		
		return employeeRepository.findAll();
	
	}

	@Override
	public Employee addEmployee(Employee emp) {
		
		if(employeeRepository.existsById(emp.getId())) {
			return null;
		}
		else {
			return employeeRepository.save(emp);

		}
	}

}
