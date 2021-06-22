package kodlamaio.day6HrmsProject.business.abstracts;

import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.Website;

public interface WebsiteService {

	Result add(Website website);
}
