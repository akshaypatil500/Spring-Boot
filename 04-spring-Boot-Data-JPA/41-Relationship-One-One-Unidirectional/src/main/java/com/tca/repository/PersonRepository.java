package com.tca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tca.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
	@Query("select p from Person p where p.name like '%k%'")
	public Person findPersonByName(String name);


}
