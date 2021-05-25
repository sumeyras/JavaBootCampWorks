package day5ECommerceDemo.JAccount;

import day5ECommerceDemo.entities.concretes.User;

//Dýþ Account servisi olduðunu düþün.
public class JAccountManager {

	public void register(User user) {
		
		System.out.println("Google hesabý ile sisteme kaydolundu : " + user.getFirstName());
	}
}
