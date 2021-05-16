package work3;

public class Student extends User {
	
	private String firstName;
	private String lastName;
	private String status;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String status) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.status = status;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
}
