package com.tca.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tca.entity.Employee;
import com.tca.service.EmployeeService;

@Controller
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id){ 
		
		Employee emp=employeeService.fetchEmployeeById(id);
		
		if(emp==null) {
			
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		else {
			return new ResponseEntity<>(emp,HttpStatus.OK);

		}
	}
	
	@GetMapping("employees")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		
		 List<Employee> emps=employeeService.fetchEmployees();
		 
		 if(emps.isEmpty()) {
			 
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		 }
		 else {
				return new ResponseEntity<>(emps,HttpStatus.OK);

		 }
	}
	
	@PostMapping("addEmployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp){
		
		Employee updatedEmp=employeeService.addEmployee(emp);
		if(updatedEmp==null) {

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		}
		else {
			
			return new ResponseEntity<>(updatedEmp,HttpStatus.CREATED);

		}
	}
}
