package javaOdev3;

public class UserManager  {
	public void login(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " ----> Giri� Sa�land�");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " ----> ��k�� Sa�land�");

	}
}
