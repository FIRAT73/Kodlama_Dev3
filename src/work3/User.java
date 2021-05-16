package work3;

public class User {

	private int id;
	private String password;
	private String email;
	private String course;
	
	public User() {
		
	}

	public User(int id, String password, String email, String course) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
