package com.tca.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.tca.model.Employee;

@Component
public class MyAppRunner implements ApplicationRunner {

	@Autowired
	private RestTemplate restTemplate;

	/*
	 * When only @Autowired is used:
	 * If the bean is found, it will be injected.
	 * Otherwise, an UnsatisfiedDependencyException occurs.
	 *
	 * When @Autowired(required = false) is used:
	 * If the bean is found, it will be injected.
	 * Otherwise, restTemplate remains null.
	 */
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
   /*		
		// Retrieves only the response body data as an Employee object.
		 Employee emp = restTemplate.getForObject(
		    "http://localhost:8080/employee/{id}",
		     Employee.class,
		     1
		);
		
		System.out.println("Data :"+emp);
 */
		ResponseEntity<Employee> rs=restTemplate.getForEntity("http://localhost:8080/employee/{id}",Employee.class, 5);
		
	    HttpStatusCode status= rs.getStatusCode();
	    Employee emp=rs.getBody();
	
		if(status.is2xxSuccessful()) {

			System.out.println("Employee Data "+emp);
		}
		
		
		
	}

}
