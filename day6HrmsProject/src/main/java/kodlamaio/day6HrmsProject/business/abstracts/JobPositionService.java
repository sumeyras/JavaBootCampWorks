package kodlamaio.day6HrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.JobPosition;

public interface JobPositionService {
	
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
	
}
