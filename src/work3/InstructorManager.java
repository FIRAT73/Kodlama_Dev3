package work3;

public class InstructorManager {

	public void InstructorCreate(Instructor instructor) {
		System.out.println("Egitmen ismi: " + instructor.getFirstName() + "\n" + "Soyismi : " + instructor.getLastName() + "\n"  
													+ "Egitmenin Kursu: " + instructor.getCourse() +"\n\n");
	}
}
