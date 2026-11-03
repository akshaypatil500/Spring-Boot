package com.tca.api;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tca.entity.Employee;
import com.tca.exception.EmployeeAlreadyExistException;
import com.tca.exception.EmployeeNotFoundException;
import com.tca.service.EmployeeService;

@RestController
public class EmployeeRestController 
{
	@Autowired
	private EmployeeService service;
	
	
	@GetMapping(value="/employee/{id}", produces={"application/json","application/xml"})
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id)
	{
		Employee emp = service.fetchEmployeeById(id);  // emp <---- service layer <-- repo layer
		
		if(emp==null)
		{
			throw new EmployeeNotFoundException("Employee with empno:" + id + " does not Exist !");
			//return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		else
		{
			return new ResponseEntity<>(emp, HttpStatus.OK);
		}
	}
	
	
	@GetMapping(value="/employees", produces={"application/xml","application/json"})
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		List<Employee> emps = service.fetchAllEmployee();
		
		if(emps.isEmpty())
		{
			throw new EmployeeNotFoundException("Employee data not yet Avaiable !!");
			//return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else
		{
			return new ResponseEntity<>(emps, HttpStatus.OK);
		}
	}
	
	
	@PostMapping(value="/add", 
			     consumes={"application/xml","application/json"}, 
			     produces={"application/xml","application/json"})
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) // 106 XYZ 1000 10
	{
		Employee updatedEmp = service.saveEmployee(emp);
		
		if(updatedEmp == null)
		{
			throw new EmployeeAlreadyExistException("Employee with empno:" + emp.getId() +" is already Present !!" );
			//return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		else
		{
			return new ResponseEntity<>(updatedEmp, HttpStatus.CREATED);
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> removeEmployee(@PathVariable Integer id)
	{
		boolean status = service.removeEmployee(id);
		
		if(status)
		{
			return new ResponseEntity<>("Employe is Deleted !!!", HttpStatus.OK);
		}
		else
		{
			throw new EmployeeNotFoundException("Employee with empno :" + id + " is not present to Delete" );
			//return new ResponseEntity<>("Employe does not Exist !!!", HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee> modifyEmployee(@RequestBody Employee emp)
	{
		Employee updatedEmp = service.updateEmployee(emp);
		
		if(updatedEmp==null)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		else
		{
			return new ResponseEntity<>(updatedEmp, HttpStatus.OK);
		}
	}
	
	@PatchMapping("/update/{id}")
	public ResponseEntity<Employee> modifyEmployee(@RequestBody Map<String, Object> fieldMap, 
												  @PathVariable Integer id )
	{
		Employee updatedEmp = service.updateEmployeeById(fieldMap, id);
		
		if(updatedEmp==null)
		{
			throw new EmployeeNotFoundException("Employee with empno :" + id + " is not present to Update ");
			//return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		else
		{
			return new ResponseEntity<>(updatedEmp, HttpStatus.OK);
		}
	}
}












