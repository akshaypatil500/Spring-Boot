package com.tca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tca.repository.StudentRepository;

@SpringBootApplication
public class Application {

	private final StudentRepository studentRepository;

	Application(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
		
	}

}
