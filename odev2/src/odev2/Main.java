package odev2;

public class Main 
{

	public static void main(String[] args) 
	{
		Courses course1 = new Courses();
		course1.id =1;
		course1.courseName = " Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + Angular)";
		course1.courseInstructorName = "Engin Demiro�";
		course1.detail = "%10 tamamland�";
		
		Courses course2 = new Courses(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(Java + React)","Engin Demiro�","%20 tamamland�");
		Courses course3 = new Courses(3,"Programlamaya Giri� ��in Temel Kurs","Engin Demiro�","%0 tamamland�");
		
		Courses[] kurslar = {course1,course2,course3};
		
		for(Courses kurs:kurslar) 
		{
			System.out.println(kurs.id +  "---->"+kurs.courseName);
		}
		
		
		Category category1 =  new Category(111,"Kurslar�m");
		Category category2 =  new Category(222,"T�m Kurslar");
		Category category3 =  new Category(333,"Kampa Haz�rl�k");
		Category category4 =  new Category(444,"S�k Sorulan Sorular");
		
		Category[] kategoriler = {category1,category2, category3,category4};
		
		for(Category kategori :kategoriler) 
		{
			System.out.println(kategori.id + "---->" + kategori.categoryName);
		}
		
		Button button1 =  new Button(5,"< �nceki Ders");
		Button button2 =  new Button(7,"Bitir ve Devam et >");
		
		
		ButtonManager buttonManager = new ButtonManager();
		buttonManager.runButton(button1);
		buttonManager.runButton(button2);
		


	}

}
