package javaOdev3;

public class InstructorManager extends UserManager {
	public void informationCourse(Instructor instructor) {
		System.out.println("E�itim " + instructor.getFirstName()  +  instructor.getLastName() + " taraf�ndan verilmektedir.");
	}

}
