package com.tca.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.tca.model.Employee;

import reactor.core.publisher.Mono;

@Component
public class MyAppRunner implements ApplicationRunner {

	@Autowired
	private WebClient webClient;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		// Calling GET /employee{id}

		Mono<Employee> empMono = webClient.get()
				.uri("http://localhost:8080/employee/{id}",200)
				.retrieve()
				.bodyToMono(Employee.class);
		
		empMono.subscribe(emp -> System.out.println(emp),
				       
				          error ->{
				        	  
				          System.out.println("NO EMPLOYEE FOUND !");
				          if(error instanceof WebClientResponseException) {	         
				        	  
					          WebClientResponseException wex=(WebClientResponseException)error;
					          System.out.println("Status Code : "+wex.getStatusCode());
					          System.out.println("Message : "+wex.getResponseBodyAsString());

				          }
				          
				     
				       }
				    
		     	//sending Two paramter to subscribe method as a lambsa expression	          
				
				);
		

		
		// Calling GET /employees
/*		
		Flux<Employee> empFlux = webClient.get()

		        .uri("http://localhost:8080/employees")

		        .accept(MediaType.APPLICATION_JSON)

		        .retrieve()

		        .bodyToFlux(Employee.class);

		empFlux.subscribe(emp -> System.out.println(emp));
*/
		
		// Calling POST /saveEmployee
/*		
		Employee emp = new Employee();

		emp.setId(18);
		emp.setName("suyog Patil");
		emp.setEmail("suyog@gmail.com");
		emp.setDepartment("IT");
		emp.setSalary(55000.0);
		
		Mono<Employee> empMono=webClient.post()
				.uri("http://localhost:8080/add")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.bodyValue(emp)                     //Request Body - EMP object to JSON Conversion 
				.retrieve()
				.bodyToMono(Employee.class);        //Response Body - JSON to EMP object Conversion
		
		empMono.subscribe(e -> System.out.println(e)
				                             
				         );
*/
		
		
	}

}