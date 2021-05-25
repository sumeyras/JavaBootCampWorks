package day4CoffeShop.Abstracts;

import day4CoffeShop.Entities.Customer;

public interface ICustomerCheckService {
	
	boolean CheckIfRealPerson(Customer customer);

}
