package work3;

public class StudentManager {

	public void studentCreate(Student student) {
		System.out.println("Yeni �grenci : \n" + "isim: " + student.getFirstName() + "\n" + "Soyisim : " + 
									student.getLastName() + "\n" + "Sectigi Kurs: " + student.getCourse() + "\n\n");
	}
	
	public void studentProgress(Student student) {
		System.out.println("��renci Ad�: " + student.getFirstName() + "\n" + "�lerleme durumu: " + student.getStatus() + "\n\n");
	}
}
