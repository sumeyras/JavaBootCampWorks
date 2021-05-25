package day4CoffeShop.Concretes;

import day4CoffeShop.Abstracts.ICustomerCheckService;
import day4CoffeShop.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub

		return true;
		
	}
	
	

}
