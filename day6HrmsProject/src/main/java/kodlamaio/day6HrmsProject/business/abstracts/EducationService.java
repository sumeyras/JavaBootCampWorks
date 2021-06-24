package kodlamaio.day6HrmsProject.business.abstracts;

import java.util.List;



import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.Education;

public interface EducationService {

	
	Result add(Education education);
	DataResult<List<Education>> getAllById(int userId);
}
