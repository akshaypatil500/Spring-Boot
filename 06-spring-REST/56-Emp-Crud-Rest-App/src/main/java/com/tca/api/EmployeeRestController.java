package com.tca.api;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tca.entity.Employee;
import com.tca.service.EmployeeService;

@Controller
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) {

		Employee emp = employeeService.fetchEmployeeById(id);

		if (emp == null) {

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(emp, HttpStatus.OK);

		}
	}

	@GetMapping("employees")
	public ResponseEntity<List<Employee>> getAllEmployees() {

		List<Employee> emps = employeeService.fetchEmployees();

		if (emps.isEmpty()) {

			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		} else {
			return new ResponseEntity<>(emps, HttpStatus.OK);

		}
	}

	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) {

		Employee updatedEmp = employeeService.addEmployee(emp);
		if (updatedEmp == null) {

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		} else {

			return new ResponseEntity<>(updatedEmp, HttpStatus.CREATED);

		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> removeEmployee(@PathVariable Integer id) {

		boolean status = employeeService.removeEmployee(id);

		if (status) {

			return new ResponseEntity<>("Eployee is Deleted !!!", HttpStatus.OK);
		} else {

			return new ResponseEntity<>("Eployee deos not Exist !!!", HttpStatus.NOT_FOUND);

		}
	}

	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp) {

		Employee updatedEmp = employeeService.updateEmployee(emp);

		if (updatedEmp == null) {

			return new ResponseEntity<>(updatedEmp, HttpStatus.NOT_FOUND);

		} else {
			return new ResponseEntity<>(updatedEmp, HttpStatus.OK);

		}
	}

	@PatchMapping("/update/{id}	")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Map<String, Object> fieldMap, @PathVariable Integer id) {

		Employee updatedEmp = employeeService.updateEmployeeById(fieldMap,id);

		if (updatedEmp == null) {

			return new ResponseEntity<>(updatedEmp, HttpStatus.NOT_FOUND);

		} else {
			return new ResponseEntity<>(updatedEmp, HttpStatus.OK);

		}
	}
}
