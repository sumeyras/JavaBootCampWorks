package kodlamaio.day6HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.day6HrmsProject.business.abstracts.JobCategoryService;
import kodlamaio.day6HrmsProject.dataAccess.abstracts.JobCategoryDao;
import kodlamaio.day6HrmsProject.entities.concretes.JobCategory;

@Service
public class JobCategoryManager implements JobCategoryService{

	private JobCategoryDao jobCategoryDao;

	@Autowired
	public JobCategoryManager(JobCategoryDao jobCategoryDao) {
		this.jobCategoryDao = jobCategoryDao;
	}

	
	@Override
	public List<JobCategory> getAll() {
		
		return this.jobCategoryDao.findAll();
	}

}
