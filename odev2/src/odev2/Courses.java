package odev2;

public class Courses {

	
	public Courses() 
	{
		System.out.println("Nitelikli Yaz�l�mc� Geli�tirici Kamp�");
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
