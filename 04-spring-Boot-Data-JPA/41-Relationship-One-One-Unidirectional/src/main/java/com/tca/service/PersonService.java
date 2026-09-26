package com.tca.service;

import com.tca.entity.Person;

public interface PersonService {
	
	public Person savePerson(Person person);
	
	public Person fetchPersonByName(String name);
	
	public void removePerson(Long pid);
	

}
