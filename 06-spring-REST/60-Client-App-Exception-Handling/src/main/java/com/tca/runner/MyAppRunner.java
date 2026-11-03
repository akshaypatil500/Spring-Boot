package com.tca.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.tca.model.Employee;

@Component
public class MyAppRunner implements ApplicationRunner {

	@Autowired
	private RestTemplate restTemplate;

	/*
	 * When only @Autowired is used: If the bean is found, it will be injected.
	 * Otherwise, an UnsatisfiedDependencyException occurs.
	 *
	 * When @Autowired(required = false) is used: If the bean is found, it will be
	 * injected. Otherwise, restTemplate remains null.
	 */

	@Override
	public void run(ApplicationArguments args) throws Exception {

		
		// Calling GET/employee/{id} via exchange()

		ResponseEntity<?> re=null;
		try {
		
			        re=restTemplate.exchange(
					"http://localhost:8080/employee/{id}",        // URL
					 HttpMethod.GET,                              // HTTP Method
					 null,                                        // NO Request Body 
					 Employee.class,                              // Response Type  
					 100                                          // URI Variable
					 ); 
			
			  HttpStatusCode status= re.getStatusCode();
				
				if(status.is2xxSuccessful()) {

				    Employee emp=(Employee) re.getBody();
					System.out.println("Employee Data "+emp);
				}

		}
		catch(HttpClientErrorException | HttpServerErrorException ex) {
			
			re =new ResponseEntity<>(ex.getResponseBodyAsString(),ex.getStatusCode());
			System.out.println("Error Response : ");
			System.out.println("Body        :" + re.getBody());
			System.out.println("Status Code : " + re.getStatusCode());
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

		  
		
		
/*	
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

		

*/		
	}

}