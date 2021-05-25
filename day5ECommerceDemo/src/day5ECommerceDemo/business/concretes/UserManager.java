package day5ECommerceDemo.business.concretes;



import day5ECommerceDemo.business.abstracts.UserService;
import day5ECommerceDemo.business.abstracts.ValidatorService;
import day5ECommerceDemo.core.abstracts.UserValidateService;
import day5ECommerceDemo.dataAccess.abstracts.UserDao;
import day5ECommerceDemo.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private ValidatorService validator;
	private UserValidateService userValidator;
	

	public UserManager(UserDao userDao, ValidatorService validator,  UserValidateService userValidator) {
		this.userDao = userDao;
		this.validator = validator;
		this.userValidator = userValidator;
	}

	@Override
	public void add(User user) {
		
		if(userValidator.validate(user)) {
			
			if(userDao.search(user.geteMail())) {
				validator.send(user);
			}
			
		}else {
			
			System.out.println("Kullanýcý kaydý yapýlamamýþtýr.");
		}		
	}
}
