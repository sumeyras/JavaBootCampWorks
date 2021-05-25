package day4Work3.Adapters;

import day4Work3.Business.Abstracts.ICustomerCheckService;
import day4Work3.Entities.Concretes.Customer;

public class EDevletServiceManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		System.out.println("E-devlet sisteminde bu kiþi mevcuttur.");
		return true;
	}
	
}
