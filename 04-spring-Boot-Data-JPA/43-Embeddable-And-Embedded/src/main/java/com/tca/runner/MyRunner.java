package com.tca.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Address;
import com.tca.entity.Employee;
import com.tca.service.EmployeeService;


@Component
public class MyRunner implements ApplicationRunner {

	

	@Autowired
	private EmployeeService employeeService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		/*
     
		Address address =new Address("12-A","MG-Road","Pune","411001"); 
		
		Employee employee =new Employee(101L,"Ram",60000.0,address);
		
		employeeService.save(employee);
		
		System.out.println("Employee is Saved with Address");
*/
		
		Employee employee= employeeService.findById(101L);
		
		System.out.println("======Employee Details======");
		System.out.println("Employee No   : " + employee.getEmpNo());
		System.out.println("Name          : " + employee.getName());
		System.out.println("Salary        : " + employee.getSalary());
		
		// Address address = employee.getAddress();
		// A separate Address variable is not required for direct access,
		// but it is useful when we want to reuse the Address object multiple times.
		
		System.out.println("Pincode       : " + employee.getAddress().getPincode());
		System.out.println("City          : " + employee.getAddress().getCity());
		System.out.println("House Number  : " + employee.getAddress().getHouseNumber());
		System.out.println("Street        : " + employee.getAddress().getStreet());
		
		
	}

}
