package com.tca.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Author;
import com.tca.entity.Book;
import com.tca.service.BookService;

import jakarta.transaction.Transactional;

@Component
public class MyRunner implements ApplicationRunner {

	@Autowired
	private BookService bookService;
	
	@Transactional
	@Override
	public void run(ApplicationArguments args) throws Exception {

		/*
		Book b=new Book();
		b.setBid(1L);
		b.setBookName("Java");
		
		Author o1=new Author();
		o1.setAid(101L);
		o1.setAuthorName("Rahul");
		
		Author o2=new Author();
		o2.setAid(102L);
		o2.setAuthorName("Kiran");
		
		List<Author> list=Arrays.asList(o1,o2);
		b.setAuthor(list);
		
		bookService.saveBook(b);
      */
		
		
/*		
		Book b = bookService.fetchById(1L);

		System.out.println("===== BOOK DETAILS =====");
		System.out.println("Book ID   : " + b.getBid());
		System.out.println("Book Name : " + b.getBookName());

		System.out.println("===== AUTHOR DETAILS =====");

			for (Author a : b.getAuthor()) {
			    System.out.println("Author ID   : " + a.getAid());
			    System.out.println("Author Name : " + a.getAuthorName());
			    System.out.println("-------------------------");
			}
		
		
*/
		
		bookService.removeBook(1L);
		
		
		
		
		
	}

}
