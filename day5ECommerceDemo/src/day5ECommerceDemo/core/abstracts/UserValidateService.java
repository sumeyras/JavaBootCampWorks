package day5ECommerceDemo.core.abstracts;

import day5ECommerceDemo.entities.concretes.User;

public interface UserValidateService {
	
	boolean validate(User user);
	boolean signInControl(String email, String password);

}
