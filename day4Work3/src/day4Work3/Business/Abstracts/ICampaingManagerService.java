package day4Work3.Business.Abstracts;

import day4Work3.Entities.Concretes.Campaign;

public interface ICampaingManagerService {

	public void Add(Campaign campaign);
	public void Delete(Campaign campaign);
	public void Update(Campaign campaign);
	
}
