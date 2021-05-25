package day3Work2;

public class InstructorManager extends UserManager {
	
	@Override
	public void register(User user) {
		System.out.println("" + user.getEmail() +" öğretmen olarak sisteme eklendi");
	}

}
