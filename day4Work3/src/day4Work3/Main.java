package day4Work3;

import java.time.LocalDate;

import day4Work3.Adapters.EDevletServiceManager;
import day4Work3.Business.Concretes.CustomerManager;
import day4Work3.Business.Concretes.SaleManager;
import day4Work3.Entities.Concretes.Campaign;
import day4Work3.Entities.Concretes.Customer;
import day4Work3.Entities.Concretes.Game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer1= new Customer(1,"Sümeyra","Cakmak",LocalDate.of(1995,8,25),"546621334651");
		
		CustomerManager customerManager = new CustomerManager(new EDevletServiceManager());
		
		customerManager.Add(customer1);
		
		Game game1 = new Game(1, "Bubble Puzzle", "Zeka Oyunlarý", 12.3);
		Campaign campaign1 = new Campaign(1,25, "Oynayalým oynatalým");
		game1.setCampaign(campaign1);
		SaleManager sale1 = new SaleManager();
		sale1.SaleGame(customer1, game1, campaign1 );
		
		
	
	}

}
