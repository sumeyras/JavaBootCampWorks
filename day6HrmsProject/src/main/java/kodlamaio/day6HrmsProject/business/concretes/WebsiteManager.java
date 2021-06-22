package kodlamaio.day6HrmsProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.day6HrmsProject.business.abstracts.WebsiteService;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccesResult;
import kodlamaio.day6HrmsProject.dataAccess.abstracts.WebsiteDao;
import kodlamaio.day6HrmsProject.entities.concretes.Website;

@Service
public class WebsiteManager implements WebsiteService {
	
	private WebsiteDao websiteDao;
	
	@Autowired
	public WebsiteManager(WebsiteDao websiteDao) {

		this.websiteDao = websiteDao;
	}
	
	
	
	@Override
	public Result add(Website website) {
		this.websiteDao.save(website);
		return new SuccesResult("Websiteler kaydedildi");
	}

}
