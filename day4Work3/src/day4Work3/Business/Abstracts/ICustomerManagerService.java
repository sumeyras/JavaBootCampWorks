package day4Work3.Business.Abstracts;

import day4Work3.Entities.Concretes.Customer;

public interface ICustomerManagerService {
	
	public void Add(Customer customer);
	
	public void Delete(Customer customer);
	
	public void Update(Customer customer);

}
