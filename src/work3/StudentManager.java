package work3;

public class StudentManager {

	public void studentCreate(Student student) {
		System.out.println("Yeni Ögrenci : \n" + "isim: " + student.getFirstName() + "\n" + "Soyisim : " + 
									student.getLastName() + "\n" + "Sectigi Kurs: " + student.getCourse() + "\n\n");
	}
	
	public void studentProgress(Student student) {
		System.out.println("Öğrenci Adı: " + student.getFirstName() + "\n" + "İlerleme durumu: " + student.getStatus() + "\n\n");
	}
}
