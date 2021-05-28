package kodlamaio.day6HrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.day6HrmsProject.entities.concretes.JobCategory;

public interface JobCategoryService {
	
	List<JobCategory> getAll();
}
