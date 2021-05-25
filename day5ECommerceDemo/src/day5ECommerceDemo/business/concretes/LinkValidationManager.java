package day5ECommerceDemo.business.concretes;

import day5ECommerceDemo.business.abstracts.ValidationService;
import day5ECommerceDemo.dataAccess.abstracts.UserDao;
import day5ECommerceDemo.entities.concretes.User;

public class LinkValidationManager implements ValidationService {

	private UserDao userDao;
	
	public LinkValidationManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void click(User user) {
		System.out.println("Kullanýcý e-postasý onaylanmýþtýr : " + user.getFirstName());
		userDao.addToDb(user);
		
	}

	

}
