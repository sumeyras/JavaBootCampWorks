package day5ECommerceDemo.business.concretes;

import day5ECommerceDemo.JAccount.JAccountManager;
import day5ECommerceDemo.business.abstracts.AccountService;
import day5ECommerceDemo.entities.concretes.User;


public class JAccountManagerAdapter implements AccountService{

	@Override
	public void registerByGoogle(User user) {
		JAccountManager jAccountManager = new JAccountManager();
		jAccountManager.register(user);
	}

}
