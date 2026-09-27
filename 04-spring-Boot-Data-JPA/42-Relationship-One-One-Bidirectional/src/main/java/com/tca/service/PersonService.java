package com.tca.service;

import com.tca.entity.Person;

public interface PersonService {
	
	public Person savePerson(Person person);
	
	public Person findById(Long id);
	
	public void removePerson(Long pid);
	

}
