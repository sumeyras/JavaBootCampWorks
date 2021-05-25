package day4Work3.Business.Concretes;

import day4Work3.Business.Abstracts.ICustomerCheckService;
import day4Work3.Entities.Concretes.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}


}
