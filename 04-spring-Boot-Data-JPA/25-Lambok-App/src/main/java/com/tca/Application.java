package com.tca;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tca.entity.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		System.out.println("Hellos");
		Student s=new Student();
		s.setRno(101);
		s.setName("Akshay");
		s.setCity("Pune");
		s.setPer(78.0);
		
		System.out.println(s);
	}

}
