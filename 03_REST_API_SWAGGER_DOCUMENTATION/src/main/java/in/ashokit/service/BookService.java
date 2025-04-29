package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.Book;
import in.ashokit.repo.BookRepository;

@Service
public class BookService 
{
	@Autowired
	private BookRepository bookRepo;
	
	public Book saveBook(Book book) {		
		return bookRepo.save(book);
	}
}
