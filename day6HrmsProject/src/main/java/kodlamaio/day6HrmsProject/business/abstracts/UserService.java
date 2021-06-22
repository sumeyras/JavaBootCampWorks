package kodlamaio.day6HrmsProject.business.abstracts;

import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.entities.concretes.User;

public interface UserService {
	
	DataResult<User> getById(int id);

}
