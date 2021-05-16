package work3;

public class main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setId(1);
		user1.setEmail("Firat@gmail.com");
		user1.setPassword("12345");
		user1.setCourse("Java Kursu");
				
		User user2 = new User();
		user2.setId(2);
		user2.setEmail("Firat2@gmail.com");
		user2.setPassword("6789");
		user2.setCourse(" C# Kursu");
		
		UserManager userManager1 = new UserManager();
		userManager1.userAdd(user1);
 
		UserManager userManager2 = new UserManager();
		userManager2.userAdd(user2);
		
		Student student1 = new Student();
		student1.setFirstName("Firat");
		student1.setLastName("SEVEN");
		student1.setEmail("Firat@gmail.com");
		student1.setPassword("Firat123");
		student1.setId(1);
		student1.setCourse("Java kursu");
		student1.setStatus("%48");
			
		Student student2 = new Student();
		student2.setFirstName("Furkan");
		student2.setLastName("SEVEN");
		student2.setEmail("Furkan@gmail.com");
		student2.setPassword("Furkan123");
		student2.setId(2);
		student2.setCourse(" C++ kursu");
		student2.setStatus("%78");
		
		StudentManager studentManager1 = new StudentManager();
		studentManager1.studentCreate(student1);
		studentManager1.studentProgress(student1);
		
		StudentManager studentManager2 = new StudentManager();
		studentManager2.studentCreate(student2);
		studentManager2.studentProgress(student2);
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setCourse("Java Kursu");
		
		Instructor instructor2 = new Instructor();
		instructor2.setFirstName("Engin");
		instructor2.setLastName("Demirog");
		instructor2.setCourse(" C++ Kursu");
		
		InstructorManager instructorManager1 = new InstructorManager();
		instructorManager1.InstructorCreate(instructor1);	
			
		InstructorManager instructorManager2 = new InstructorManager();
		instructorManager2.InstructorCreate(instructor2);	
	}

}
