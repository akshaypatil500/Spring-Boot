package com.tca.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Book;
import com.tca.repository.BookRepository;

@Service("bookService")
public class BookServiceImpl implements BookService {

	 @Autowired
	 private BookRepository bookRepository;
	
	@Override
	public Book saveBook(Book book) {
		
		return bookRepository.save(book);
	}

	@Override
	public Book fetchById(Long bid) {

	    Optional<Book> o = bookRepository.findById(bid);

	    if (o.isPresent()) {
	        return o.get();
	    } else {
	        System.out.println("Book Not Found");
	        return null;
	    }
	}

	@Override
	public void removeBook(Long bid) {
		
		bookRepository.deleteById(bid);;
		
	}

}
