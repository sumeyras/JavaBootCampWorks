import day5ECommerceDemo.business.abstracts.LoginService;
import day5ECommerceDemo.business.abstracts.UserService;
import day5ECommerceDemo.business.abstracts.ValidationService;
import day5ECommerceDemo.business.concretes.EmailValidatorManager;
import day5ECommerceDemo.business.concretes.LinkValidationManager;
import day5ECommerceDemo.business.concretes.LoginManager;
import day5ECommerceDemo.business.concretes.UserManager;
import day5ECommerceDemo.core.concretes.UserValidateManager;
import day5ECommerceDemo.dataAccess.concretes.XUserDao;
import day5ECommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Sumeyra");
		user1.setLastName("Çakmak");
		user1.seteMail("sumeyra@gmail.com");
		user1.setPassword("123456");
		
		UserService userService1 = new UserManager(new XUserDao(), new EmailValidatorManager(), new UserValidateManager());
		userService1.add(user1);
		
		ValidationService validationService = new LinkValidationManager(new XUserDao());
		validationService.click(user1);
		
		
		LoginService login1 =new LoginManager(new UserValidateManager(), new XUserDao());
		login1.signIn(user1.geteMail(), user1.getPassword());
		
	}

}
