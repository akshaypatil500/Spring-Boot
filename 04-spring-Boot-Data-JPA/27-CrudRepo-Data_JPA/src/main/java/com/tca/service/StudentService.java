package com.tca.service;

import java.util.List;
import java.util.Optional;

import com.tca.entity.Student;

public interface StudentService {
	
	  public Student save(Student s);
	  
	  public Student update(Student s);
	  
	  public Optional<Student> fetchById(Integer rno);//it might return null that is why Optional

	  public List<Student> fetchAll();
	  
	  public boolean deleteById(Integer rno);
	  
	  public List<Student> saveAll(List<Student> s);
	  
	  public void deleteAll();
	  
	  public Long count();



}
