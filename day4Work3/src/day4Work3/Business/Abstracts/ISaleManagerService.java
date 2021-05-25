package day4Work3.Business.Abstracts;

import day4Work3.Entities.Concretes.Campaign;
import day4Work3.Entities.Concretes.Customer;
import day4Work3.Entities.Concretes.Game;

public interface ISaleManagerService {
	
	public void SaleGame(Customer customer, Game game, Campaign campaign);

}
