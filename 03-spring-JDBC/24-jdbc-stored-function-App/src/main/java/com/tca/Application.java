package com.tca;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tca.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		
		StudentRepository repo=context.getBean(StudentRepository.class);
		
	Map<String,Object> map=	repo.getGrade(101);
	System.out.println(map.values());
	}

}
