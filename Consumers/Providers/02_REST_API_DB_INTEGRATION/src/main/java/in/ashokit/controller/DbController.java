package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import in.ashokit.Book;
import in.ashokit.service.BookService;

@Controller
public class DbController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/saveBook")
	public ResponseEntity<Book> saveBook(@RequestBody Book book){
		Book savedBook = bookService.saveBook(book);
		System.out.println("Book Saved : " + book);
		return new ResponseEntity<>(savedBook, HttpStatus.OK);
	}
	
}
