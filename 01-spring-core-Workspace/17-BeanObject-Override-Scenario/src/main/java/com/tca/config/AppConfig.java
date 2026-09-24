package com.tca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tca.service.ServiceB;

@Configuration
@ComponentScan(basePackages ="com.tca")
public class AppConfig {
	
	@Bean("serviceB")
	public ServiceB serviceB() {

	    System.out.println("@Bean method called");

	    return new ServiceB();
	}

}
