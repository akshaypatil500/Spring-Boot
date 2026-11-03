package com.tca.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.tca.model.Employee;
import com.tca.utils.MyAppUtils;

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
		
 /*		
		ResponseEntity<Employee> rs=restTemplate.getForEntity("http://localhost:8080/employee/{id}",Employee.class, 5);
		
	    HttpStatusCode status= rs.getStatusCode();
	    Employee emp=rs.getBody();
	
		if(status.is2xxSuccessful()) {

			System.out.println("Employee Data "+emp);
		}
 */
	
		
		// Calling GET/employee/{id} via exchange()

/*
		ResponseEntity<Employee> re=restTemplate.exchange(
				"http://localhost:8080/employee/{id}",        // URL
				 HttpMethod.GET,                              // HTTP Method
				 null,                                        // NO Request Body 
				 Employee.class,                              // Response Type  
				 1                                          // URI Variable
				 ); 
		
		    HttpStatusCode status= re.getStatusCode();
		
			if(status.is2xxSuccessful()) {

			    Employee emp=re.getBody();
				System.out.println("Employee Data "+emp);
			}
*/
		
		// Calling GET /employee{id} via exchange() By Setting Header

/*		
		HttpHeaders requestHeader = new HttpHeaders();
		requestHeader.add("Accept","application/xml");
		
		HttpEntity<Employee> requestEntity = new HttpEntity<Employee>(requestHeader);
		
		ResponseEntity<Employee> re=restTemplate.exchange(
				"http://localhost:8080/employee/{id}",        // URL
				 HttpMethod.GET,                              // HTTP Method
                 requestEntity,                               // NO Request Body,but has header 
				 Employee.class,                              // Response Type  
				 2                                          // URI Variable
				 ); 
		
		    HttpStatusCode status= re.getStatusCode();
		
			if(status.is2xxSuccessful()) {

			    Employee emp=re.getBody();
				System.out.println("Employee Data "+emp);
			}
*/		
		
		// POST /add : Calling via exchange()
		
		Employee emp=new Employee();
		emp.setId(19);
		emp.setName("Ram");
		emp.setEmail("ram@example.com");
		emp.setDepartment("Stock");
		emp.setSalary(40000.0);
		
		HttpHeaders requestHeader=new HttpHeaders();
		requestHeader.add("Accept","application/xml");
		requestHeader.add("Content-Type", "application/xml");
		                                                            //Body  //Header
		HttpEntity<Employee> requestEntity =new HttpEntity<Employee>(emp  ,requestHeader);
		
		ResponseEntity<Employee> re=restTemplate.exchange(
				 MyAppUtils.ADD_EMP_URL,                         // URL
				 HttpMethod.POST,                              // HTTP Method
                 requestEntity,                               // NO Request Body,but has header 
				 Employee.class                              // Response Type  
				 );
		
	        HttpStatusCode status= re.getStatusCode();
		
				if(status.is2xxSuccessful()) {

				    Employee e=re.getBody();
					System.out.println("Employee Data is Saved Successfully "+e);
				}

		
		
	}

}
