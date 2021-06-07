package kodlamaio.day6HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.day6HrmsProject.business.abstracts.JobPositionService;
import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.ErrorDataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.ErrorResult;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccesResult;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccessDataResult;
import kodlamaio.day6HrmsProject.dataAccess.abstracts.JobPositionDao;
import kodlamaio.day6HrmsProject.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		this.jobPositionDao = jobPositionDao;
	}

	
	
	public DataResult<JobPosition> notExistPosition(String positionName){
		if(jobPositionDao.findByPositionNameIgnoreCase(positionName) == null) {
			
			return new SuccessDataResult<JobPosition>(jobPositionDao.findByPositionNameIgnoreCase(positionName));
			
		}
		
		return new ErrorDataResult<JobPosition>(jobPositionDao.findByPositionNameIgnoreCase(positionName));
	}
	
	
	@Override
	public DataResult<List<JobPosition>>  getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll());
	}



	@Override
	public Result add(JobPosition jobPosition) {
		
		if(!notExistPosition(jobPosition.getPositionName()).isSuccess()) {
			
			return new ErrorResult(jobPosition.getPositionName() +" exist in DB");
		}
		jobPositionDao.save(jobPosition);
		return new SuccesResult(jobPosition.getPositionName() + " added in DB");
	}

}
