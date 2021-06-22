package kodlamaio.day6HrmsProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.day6HrmsProject.business.abstracts.UserService;
import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccessDataResult;
import kodlamaio.day6HrmsProject.dataAccess.abstracts.UserDao;
import kodlamaio.day6HrmsProject.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {

		this.userDao = userDao;
	}


	@Override
	public DataResult<User> getById(int id) {
		
		return new SuccessDataResult<User>(this.userDao.getById(id), "Data");
	}

}
