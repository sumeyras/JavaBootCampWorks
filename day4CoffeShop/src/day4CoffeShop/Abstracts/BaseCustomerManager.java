package day4CoffeShop.Abstracts;

import day4CoffeShop.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
	
	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		
		System.out.println(customer.getFirstName()+ " veritabanýna kaydedildi.");
		
	}
	

}
