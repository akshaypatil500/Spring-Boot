package com.tca.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tca.entity.Gender;
import com.tca.entity.Student;

import jakarta.transaction.Transactional;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	
	public List<Student> findAllByGreterThanPerAndGender(@Param("per") double per,
			                                            @Param("gender") Gender gender);
	
	@Modifying
	@Transactional
	public void updateByName(@Param("name")String name,
			                 @Param("rno") Integer rno);
	
	public List<Object[]> findByGenderAndName(String name,Gender gender);
	
	public List<Object[]> countByGender(); 

	
	
}
