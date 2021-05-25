package day3Work2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Sümeyra");
		student1.setEmail("sumeyra.cak@gmail.com");
		student1.setPassword("hdshd");
		student1.setGrade(4);
		
		Instructor instructor1= new Instructor();
		instructor1.setId(1);
		instructor1.setName("SDSDS");
		instructor1.setEmail("sdsdsd@gmail.com");
		instructor1.setPassword("hdshcxcd");
		instructor1.setCertificate("sdsdasdas");
		
		UserManager userManager = new StudentManager();
		userManager.register(student1);
		
		userManager = new InstructorManager();
		userManager.register(instructor1);

		

		
		
		
	

		
	}

}
