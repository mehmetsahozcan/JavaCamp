package javaOdev3;

public class InstructorManager extends UserManager {
	public void informationCourse(Instructor instructor) {
		System.out.println("Eðitim " + instructor.getFirstName()  +  instructor.getLastName() + " tarafýndan verilmektedir.");
	}

}
