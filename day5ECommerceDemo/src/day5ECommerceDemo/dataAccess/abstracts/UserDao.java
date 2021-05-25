package day5ECommerceDemo.dataAccess.abstracts;

import day5ECommerceDemo.entities.concretes.User;

public interface UserDao {
	
	 boolean search(String email);
	 void addToDb(User user);
	 boolean loginControl(String email, String password);

}
