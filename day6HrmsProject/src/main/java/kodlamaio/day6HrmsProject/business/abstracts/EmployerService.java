package kodlamaio.day6HrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.Employer;

public interface EmployerService {
	
	Result register(Employer employer);
	DataResult<List<Employer>> getAll();

}
