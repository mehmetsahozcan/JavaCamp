package odev2;

public class Main 
{

	public static void main(String[] args) 
	{
		Courses course1 = new Courses();
		course1.id =1;
		course1.courseName = " Yazýlým Geliþtirici Yetiþtirme Kampý(C# + Angular)";
		course1.courseInstructorName = "Engin Demiroð";
		course1.detail = "%10 tamamlandý";
		
		Courses course2 = new Courses(2,"Yazýlým Geliþtirici Yetiþtirme Kampý(Java + React)","Engin Demiroð","%20 tamamlandý");
		Courses course3 = new Courses(3,"Programlamaya Giriþ Ýçin Temel Kurs","Engin Demiroð","%0 tamamlandý");
		
		Courses[] kurslar = {course1,course2,course3};
		
		for(Courses kurs:kurslar) 
		{
			System.out.println(kurs.id +  "---->"+kurs.courseName);
		}
		
		
		Category category1 =  new Category(111,"Kurslarým");
		Category category2 =  new Category(222,"Tüm Kurslar");
		Category category3 =  new Category(333,"Kampa Hazýrlýk");
		Category category4 =  new Category(444,"Sýk Sorulan Sorular");
		
		Category[] kategoriler = {category1,category2, category3,category4};
		
		for(Category kategori :kategoriler) 
		{
			System.out.println(kategori.id + "---->" + kategori.categoryName);
		}
		
		Button button1 =  new Button(5,"< Önceki Ders");
		Button button2 =  new Button(7,"Bitir ve Devam et >");
		
		
		ButtonManager buttonManager = new ButtonManager();
		buttonManager.runButton(button1);
		buttonManager.runButton(button2);
		


	}

}
