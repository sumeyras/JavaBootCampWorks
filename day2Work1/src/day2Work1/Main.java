package day2Work1;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setName("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
		course1.setExplanation("2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný buradan yapacaðýz.");
		course1.setFree(true);
		course1.setInstructorName("Engin Demiroð");
		
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný buradan yapacaðýz.",
				true, "Engin Demiroð");
		
		Course course3 = new Course();
		course3.setId(3);
		course3.setName("Programlamaya Giriþ için Temel Kurs");
		course3.setExplanation("PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.");
		course3.setFree(true);
		course3.setInstructorName("Engin Demiroð");

		
		Course[] courses  = {course1, course2, course3};
		
		for (Course course : courses) {
			
			System.out.println(""+course.getName());
			
		}
		
		System.out.println("\n******** TÜM KURSLAR ********\n");
		CourseManager courseManager = new CourseManager();
		courseManager.listCourses(courses);
		
		System.out.println("\n******************************\n");
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);

	}

}
