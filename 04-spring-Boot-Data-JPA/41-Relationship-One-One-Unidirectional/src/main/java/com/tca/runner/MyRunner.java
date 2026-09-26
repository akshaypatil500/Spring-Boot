package com.tca.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Passport;
import com.tca.entity.Person;
import com.tca.service.PersonService;

@Component
public class MyRunner implements ApplicationRunner {

	@Autowired
	private PersonService personService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

/*		
		Passport passport1=new Passport();
		passport1.setPassportNumber(1111111L);
		passport1.setExpiryDate(LocalDate.of(2030, 3, 1));

		Person p=new Person();
		p.setName("Kiran");
		p.setDateOfBirth(LocalDate.of(2000,1,2));
		p.setPassport(passport1);
		
		personService.savePerson(p);
		System.out.println("Persong is Saved With Id :"+p.getPno());
*/
		
		
		Person p=personService.fetchPersonByName("k");
		
		System.out.println("Number : "+p.getPno());
		System.out.println("Name   : "+p.getName());

		
		
		
	}

}
