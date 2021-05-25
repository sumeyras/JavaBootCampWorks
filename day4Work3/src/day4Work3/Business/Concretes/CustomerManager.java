package day4Work3.Business.Concretes;

import day4Work3.Business.Abstracts.ICustomerCheckService;
import day4Work3.Business.Abstracts.ICustomerManagerService;
import day4Work3.Entities.Concretes.Customer;

public class CustomerManager implements ICustomerManagerService{
	
	private ICustomerCheckService eDevlet ;
	
	public CustomerManager(ICustomerCheckService eDevlet) {

		this.eDevlet = eDevlet;
	}
	
	@Override
	public void Add(Customer customer) {
		
		if(eDevlet.CheckIfRealPerson(customer)) {
			System.out.println("Sisteme kayýt yapýldý: " + customer.getFirstname());
		}
		
	}
	
	@Override
	public void Delete(Customer customer) {
		
		System.out.println("Bilgileri silindi: " + customer.getFirstname());
	}
	
	@Override
	public void Update(Customer customer) {
		
		System.out.println("Bilgileri güncellendi: " + customer.getFirstname());
	}

}
