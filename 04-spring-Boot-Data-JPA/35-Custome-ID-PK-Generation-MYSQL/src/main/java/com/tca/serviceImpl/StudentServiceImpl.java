package com.tca.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Student;
import com.tca.entity.repository.StudentRepository;
import com.tca.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository repo; 
	
	@Override
	public void deleteAll() {
		
		repo.deleteAll();
		
	}

	@Override
	public Student save(Student s) {
		
		return repo.save(s);
	}

}
