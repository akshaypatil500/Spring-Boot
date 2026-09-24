package com.tca.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tca.entity.Student;

public interface StudentRepository extends JpaRepository<Student,String> {
	
	 public void deleteAll();
	 
	 public Student save(Student s);

}
