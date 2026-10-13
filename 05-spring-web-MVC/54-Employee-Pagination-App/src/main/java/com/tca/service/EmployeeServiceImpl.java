package com.tca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.tca.entity.Employee;
import com.tca.repository.EmployeeRepository;

@Component("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
	
	@Override
	public Page<Employee> fetchAll(int PageNumber,int PageSize) {
		
		Pageable pageable=PageRequest.of(PageNumber, PageSize,Sort.by("salary").descending());
		return  employeeRepository.findAll(pageable);
		
		
	}

}
