package day4CoffeShop;

import java.time.LocalDate;

import day4CoffeShop.Abstracts.BaseCustomerManager;
import day4CoffeShop.Adapters.MernisServiceAdapter;
import day4CoffeShop.Concretes.NeroCustomerManager;
import day4CoffeShop.Concretes.StarbucksCustomerManager;
import day4CoffeShop.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(1,"Sümeyra","Çakmak",LocalDate.of(1995,9,26),"56143247654");
		
		BaseCustomerManager customerManager1 = new NeroCustomerManager();
		customerManager1.Save(customer);
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.Save(customer);
	}


}
