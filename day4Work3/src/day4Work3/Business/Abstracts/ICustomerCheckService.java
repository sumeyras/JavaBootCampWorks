package day4Work3.Business.Abstracts;

import day4Work3.Entities.Concretes.Customer;

public interface ICustomerCheckService {
	
	boolean CheckIfRealPerson(Customer customer);

}
