package kodlamaio.day6HrmsProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.day6HrmsProject.business.abstracts.WorkExperienceService;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccesResult;
import kodlamaio.day6HrmsProject.dataAccess.abstracts.WorkExperienceDao;
import kodlamaio.day6HrmsProject.entities.concretes.WorkExperience;

@Service
public class WorkExperienceManager implements WorkExperienceService {
	
	private WorkExperienceDao workExperienceDao;
	
	@Autowired
	public WorkExperienceManager(WorkExperienceDao workExperienceDao) {

		this.workExperienceDao = workExperienceDao;
	}

	@Override
	public Result add(WorkExperience workExperience) {
		
		this.workExperienceDao.save(workExperience);
		return new SuccesResult("İş tecrübeleri eklenmiştir");
	}
	

}
