package in.ashokit;

public class WikipediaStream {

	private String type;
	private String title;
	private String user;

	// Getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "WikipediaChange{" + "type='" + type + '\'' + ", title='" + title + '\'' + ", user='" + user + '\''
				+ '}';
	}

}
