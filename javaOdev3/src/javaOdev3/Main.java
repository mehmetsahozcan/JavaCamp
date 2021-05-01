package javaOdev3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Mehmet");
		student.setLastName("Özcan");
		student.setSchool("MSGSÜ");
		student.setSchoolNumber(401);
		student.seteMail("mehmet@outlook.com");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.seteMail("engin@outlook.com");
		
		UserManager userManager = new UserManager();
		userManager.login(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.informationCourse(instructor);
		

	}

}
