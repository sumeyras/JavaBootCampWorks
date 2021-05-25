package day5ECommerceDemo.business.concretes;

import day5ECommerceDemo.business.abstracts.ValidatorService;
import day5ECommerceDemo.entities.concretes.User;

public class EmailValidatorManager implements ValidatorService {

	@Override
	public void send(User user) {
		System.out.println(user.geteMail() +" mail adresine doðrulama e-postasý gönderilmiþtir.");
		
	}

}
