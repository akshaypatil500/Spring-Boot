package com.tca.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tca.entity.Gender;
import com.tca.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	List<Student> findByGender(Gender gender);
	
	List<Student> findByBirthDate(LocalDate d);
     
}
