package com.tca.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Author;
import com.tca.entity.Book;
import com.tca.service.AuthorService;
import com.tca.service.BookService;

import jakarta.transaction.Transactional;

@Component
public class MyRunner implements ApplicationRunner {

	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private AuthorService authorService;
	
	@Transactional
	@Override
	public void run(ApplicationArguments args) throws Exception {

		/*
		Author a=new Author();
		a.setAid(101L);
		a.setAuthorName("Akshay");
		
		Author a2=new Author();
		a2.setAid(102L);
		a2.setAuthorName("Ramesh");
		
		Book b=new Book();
		b.setId(1L);
		b.setBookName("Java");
		
		List<Author> list=Arrays.asList(a,a2);
		b.setAuthor(list);
		
		bookService.saveBook(b);
	*/
		
/*	
		Book b=new Book();
		b.setId(2L);
		b.setBookName("C++");
		
		Book b2=new Book();
		b2.setId(3L);
		b2.setBookName("C");
		
		Author a=new Author();
		a.setAid(103L);
		a.setAuthorName("Nikhil");
		
		List<Book> list=Arrays.asList(b,b2);
		
		a.setBook(list);
		
		authorService.save(a);
*/
	
/*		
		Book b = bookService.fetchById(2L);

		Author a = authorService.findById(103L);
	
		List<Author> list = b.getAuthor();

		list.add(a);

		b.setAuthor(list);

		bookService.saveBook(b);
*/	
				
		
	}

}
