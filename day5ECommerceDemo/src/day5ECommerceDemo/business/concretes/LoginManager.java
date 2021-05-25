package day5ECommerceDemo.business.concretes;

import day5ECommerceDemo.business.abstracts.LoginService;
import day5ECommerceDemo.core.abstracts.UserValidateService;
import day5ECommerceDemo.dataAccess.abstracts.UserDao;

public class LoginManager implements LoginService{

	private UserValidateService userValidator;
	private UserDao userDao;
	
	
	public LoginManager(UserValidateService userValidator, UserDao userDao) {
		this.userValidator = userValidator;
		this.userDao = userDao;
	}


	@Override
	public void signIn(String email, String password) {
		
		if(userValidator.signInControl(email, password)) {
			
			if(userDao.loginControl(email, password)) {
				System.out.println("Baþarýlý bir þekilde giriþ yapýlmþtýr.");
			}
			
		}
		
	}

}
