package ins.ahokit.binding;

public class Quote {
	
	private Integer id;
	private String quote;
	private String author;
	public Integer getId() {
		return id;
	}
	public String getQuote() {
		return quote;
	}
	public String getAuthor() {
		return author;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Quote [id=" + id + ", quote=" + quote + ", author=" + author + "]";
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	
	
}
