package com.tca.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tca.model.Student;

@Configuration
@ComponentScan("com.tca")
public class AppConfig {
	
	@Bean
	public Map<String,Student> getStudentStore()
	{
		Map<String,Student> hm=new HashMap<>();
		hm.put("SB-1", new Student("Sachin", "Pune", 78));
		hm.put("SB-2", new Student("Akshay", "Jalgaon", 81));
		
		return hm;
	}
	
	

}
