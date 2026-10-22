package com.tca.service;

import java.util.List;
import java.util.Map;
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

		Optional<Employee> opt = employeeRepository.findById(id);

		if (opt.isPresent()) {

			return opt.get();
		} else {
			return null;
		}

	}

	@Override
	public List<Employee> fetchEmployees() {

		return employeeRepository.findAll();

	}

	@Override
	public Employee addEmployee(Employee emp) {

		if (employeeRepository.existsById(emp.getId())) {
			return null;
		} else {
			return employeeRepository.save(emp);

		}
	}

	@Override
	public boolean removeEmployee(Integer id) {

		if (employeeRepository.existsById(id)) {

			employeeRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Employee updateEmployee(Employee emp) {

		if (employeeRepository.existsById(emp.getId())) {

			return employeeRepository.save(emp);
		} else {
			return null;
		}

	}

	@Override
	public Employee updateEmployeeById(Map<String, Object> fieldMap, Integer id) {

		if (employeeRepository.existsById(id)) {

			Double salary=(Double)fieldMap.get("salary");
		    String dept=(String)fieldMap.get("department");
		    
		    int noOfRowsAffected=employeeRepository.partialUpdateEmployee(salary, dept, id);
			
		    if(noOfRowsAffected==0) {
		    	return null;
		    }
	
		   else {
			
			return employeeRepository.findById(id).get();
		  }
			
		}
		else {
			return null;
		}
	
	}

}
