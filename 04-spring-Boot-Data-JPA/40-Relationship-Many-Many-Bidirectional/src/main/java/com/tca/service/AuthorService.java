package com.tca.service;

import com.tca.entity.Author;

public interface AuthorService {

	public Author save(Author author);
	
	public Author findById(Long id);
	
	public void deleteById(Long id);

}
