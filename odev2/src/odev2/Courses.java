package odev2;

public class Courses {

	
	public Courses() 
	{
		System.out.println("Nitelikli Yazýlýmcý Geliþtirici Kampý");
	}
	
	public Courses(int id, String cName, String cIName, String cDetail) 
	{
		this.id = id;
		this.courseName = cName;
		this.courseInstructorName = cIName;
		this.detail = cDetail;
		
	}
	
	
	int id;
	String courseName;
	String courseInstructorName;
	String detail;
	
	
}
