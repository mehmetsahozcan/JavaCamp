package javaOdev3;

public class StudentManager extends UserManager {
		public void add(Student student) {
			System.out.println(student.getFirstName() + student.getLastName() + "-----> Eklendi");
		}
		
		public void delete(Student student) {
			System.out.println(student.getFirstName() + student.getLastName() + "-----> Silindi");
		}
		
		public void update(Student student) {
			System.out.println(student.getFirstName() + student.getLastName() + "-----> Güncellendi");
		}
		
		
}
