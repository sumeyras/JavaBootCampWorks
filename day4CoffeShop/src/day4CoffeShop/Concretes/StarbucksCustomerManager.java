package day4CoffeShop.Concretes;


import day4CoffeShop.Abstracts.BaseCustomerManager;
import day4CoffeShop.Abstracts.ICustomerCheckService;
import day4CoffeShop.Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager{
	
	ICustomerCheckService customerCheckService;
    //DEPENDENCY INJECTION
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {

		this.customerCheckService = customerCheckService;
	}


	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("Geçersiz kullanýcý");
		}
		
	}



}
