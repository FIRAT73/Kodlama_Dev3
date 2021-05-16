package work3;

public class UserManager {
	
	public void userAdd(User user) {
		System.out.println("Yeni kullanýcý : \n" + "Id: " + user.getId() + "\n" + "E-mail: " + user.getEmail() + "\n"
				+ "Password : " + user.getPassword() + "\n" + "Ýlgilendiði kurs : " + user.getCourse() + "\n\n");
	}

}
