package day2Work1;


public class CourseManager {

	
public void addCourse(Course course) {
		
		System.out.println("" + course.getName() + " kursuna kayıt yapıldı" );
	}
	
	public void listCourses(Course [] courses) {
		
		for (Course course : courses) {
			System.out.println(course.getName());
		}
	}
}
