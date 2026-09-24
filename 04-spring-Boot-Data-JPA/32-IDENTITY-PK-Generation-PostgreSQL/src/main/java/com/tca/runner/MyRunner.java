package com.tca.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Gender;
import com.tca.entity.Student;
import com.tca.service.StudentService;

@Component
public class MyRunner implements ApplicationRunner {

	@Autowired
	private StudentService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
	//	service.deleteAll();
		
		Student s=new Student();
		s.setName("AAA");
		s.setPer(67.0);
		s.setGender(Gender.FEMALE);
		s.setBirthDate(LocalDate.now());
		
		Student result=service.save(s);
		
		if(result==null) {
			
			System.out.println("Record Not Found");
		}
		else {
			
			System.out.println("Roll No: " + s.getRno());
			System.out.println("Name: " + s.getName());
			System.out.println("Percentage: " + s.getPer());
			System.out.println("Gender: " + s.getGender());
			System.out.println("Birth Date: " + s.getBirthDate());
		}
		
	}

}
