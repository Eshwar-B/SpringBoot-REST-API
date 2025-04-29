package in.ashokit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.Book;

@RestController
public class BookRestController {

	@GetMapping(value = "/getbook", produces = "application/json")
	public ResponseEntity<List<Book>> getBook()
	{
		Book b1 = new Book(01, "rich dad, poor dad", 350.50);
		Book b2 = new Book(02, "48 laws of power", 350.50);
		Book b3 = new Book(03, "Engineering Mathematics", 350.50);
		Book b4 = new Book(04, "Java 9th Edition", 350.50);
		
		List<Book> b = Arrays.asList(b1, b2, b3, b4);
		
		return ResponseEntity.ok(b);
	}
	
}
