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
		System.out.println("Kullanıcı e-postası onaylanmıştır : " + user.getFirstName());
		userDao.addToDb(user);
		
	}

	

}
