package javaOdev3;

public class UserManager  {
	public void login(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " ----> Giriþ Saðlandý");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " ----> Çýkýþ Saðlandý");

	}
}
