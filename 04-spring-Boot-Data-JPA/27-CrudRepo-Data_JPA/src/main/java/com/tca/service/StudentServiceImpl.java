package com.tca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Student;
import com.tca.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repo;
	
	public Student save(Student student) {
		
	  Student s= repo.save(student);	
		return s;
	}

	@Override
	public Student update(Student s) {
		
		  Student s2= repo.save(s);	
			return s2;
	}

	@Override
	public Optional<Student> fetchById(Integer rno) {

		return  repo.findById(rno);
	}

	@Override
	public List<Student> fetchAll() {
         
		return (List)repo.findAll();
	}

	@Override
	public boolean deleteById(Integer rno) {
		if(repo.existsById(rno))
		{
			repo.deleteById(rno);
			return true;
		}
		else
		{			
		return false;
		}
	}

	@Override
	public List<Student> saveAll(List<Student> s) {
		
		return (List<Student>)repo.saveAll( s);
	}

	@Override
	public void deleteAll() {

        repo.deleteAll();
		
	}

	@Override
	public Long count() {
		
		return repo.count();
	}
	
	
}
