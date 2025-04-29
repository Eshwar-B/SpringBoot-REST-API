package in.ashokit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.Book;

@RestController
public class ProductRestController {

	@GetMapping("/product")
	public ResponseEntity<String> getProductInfo(@RequestParam("id") Integer id, @RequestParam("name") String name) {
		String msg = "";
		if (id == 101) {
			msg = "hello " + name + ", Apple product :: 50,000";
		} else if (id == 102) {
			msg = "hello " + name + ", Samsung product  :: 60,000";
		} else {
			msg = "product not found";
		}

		return ResponseEntity.ok(msg);
	}

	@GetMapping("/product/{id}/{name}")
	public ResponseEntity<String> getProductPrice(@PathVariable("id") Integer id, @PathVariable("name") String name) {
		String msg = "";
		if (id == 101) {
			msg = "hello " + name + ", Apple product :: 50,000";
		} else if (id == 102) {
			msg = "hello " + name + ", Samsung product  :: 60,000";
		} else {
			msg = "product not found";
		}

		return ResponseEntity.ok(msg);
	}

	@PostMapping(value = "/getbook", consumes = "application/json")
	public ResponseEntity<String> getBook(@RequestBody Book book) {
		System.out.println("Book object : " + book);
		// TODO : save into DB
		String msg = "Book Saved";
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}

	@PostMapping("/sendInUrl")
	public ResponseEntity<String> sendBookInfoByUrl(@RequestParam Integer id) {
		String msg = "";
		if (id == 101) {
			msg = "Java Book id = 101";
		} else if (id == 102) {
			msg = "Python Book id = 102";
		} else {
			msg = "book not found";
		}

		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}

	@PutMapping("/updateBook/{id}")
	public ResponseEntity<Book> putUpdateBook(@PathVariable Integer id, @RequestBody Book book) {

		System.out.println("Put Method update");
		System.out.println("Book id : " + id);
		System.out.println("Book Object : " + book);
		// TODO : Put Update Book
		return new ResponseEntity<>(book, HttpStatus.OK);
	}

	@PatchMapping(value = "/updateBook/{id}", produces = "application/json", consumes = "application/json")
	public ResponseEntity<Book> patchUpdateBook(@PathVariable Integer id, @RequestBody Book book) {
		System.out.println("Patch Method update");
		System.out.println("Book id : " + id);
		System.out.println("Book Object : " + book);
		// TODO : Patch update Book
		return new ResponseEntity<>(book, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer id) {
		System.out.println("Deleted Book record");
		System.out.println("Book id : " + id);
		// TODO : Delete the book record
		return new ResponseEntity<>("Book deleted", HttpStatus.OK);
	}
	
	
	
}
