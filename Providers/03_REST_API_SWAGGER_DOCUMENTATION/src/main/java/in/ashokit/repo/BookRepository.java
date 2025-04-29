package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
	
}
