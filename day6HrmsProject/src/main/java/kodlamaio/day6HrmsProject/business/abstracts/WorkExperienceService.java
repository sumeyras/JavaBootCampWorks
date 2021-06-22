package kodlamaio.day6HrmsProject.business.abstracts;

import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.WorkExperience;

public interface WorkExperienceService {
	
	Result add(WorkExperience workExperience);

}
