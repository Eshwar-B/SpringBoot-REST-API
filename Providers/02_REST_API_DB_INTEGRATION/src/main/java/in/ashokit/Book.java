package in.ashokit;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

	
	
	
	@Id
	private Integer bookId;
	private String bookName;
	private Double bookPrice;

	public Book() {
		
	}
	
	public Book(Integer bookId, String bookName, Double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public Integer getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}

}
