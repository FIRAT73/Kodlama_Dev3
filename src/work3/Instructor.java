package work3;

public class Instructor extends User{
	
	private String I_firstName;
	private String I_lastName;
	
	public Instructor() {
		
	}
	
	public Instructor(String firstName, String lastName) {
		super();
		this.I_firstName = firstName;
		this.I_lastName = lastName;
	}

	public String getFirstName() {
		return I_firstName;
	}

	public void setFirstName(String firstName) {
		this.I_firstName = firstName;
	}

	public String getLastName() {
		return I_lastName;
	}

	public void setLastName(String lastName) {
		this.I_lastName = lastName;
	}
	

}
