package com.tca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Author;
import com.tca.repository.AuthorRepository;

@Service("authorService")
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	@Override
	public Author save(Author author) {
		
		return authorRepository.save(author);
	}

	@Override
	public Author findById(Long id) {
		
		return authorRepository.findById(id).get();
	}

	@Override
	public void deleteById(Long id) {
	 
		authorRepository.deleteById(id);
		
	}

}
