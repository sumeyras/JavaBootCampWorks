package kodlamaio.day6HrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.day6HrmsProject.entities.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();
}
