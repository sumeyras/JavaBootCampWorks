package kodlamaio.day6HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.day6HrmsProject.business.abstracts.JobSeekerService;
import kodlamaio.day6HrmsProject.core.Validation.abstracts.ValidationService;
import kodlamaio.day6HrmsProject.core.adapters.abstracts.CheckMernisService;
import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.ErrorDataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.ErrorResult;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccesResult;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccessDataResult;
import kodlamaio.day6HrmsProject.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.day6HrmsProject.entities.concretes.JobSeeker;


@Service
public class JobSeekerManager implements JobSeekerService {

	
	private CheckMernisService checkMernisService;
	private JobSeekerDao jobSeekerDao;
	private ValidationService validationService;
	
	
	@Autowired
	public JobSeekerManager(CheckMernisService checkMernisService, JobSeekerDao jobSeekerDao, ValidationService validationService) {
		super();
		this.checkMernisService = checkMernisService;
		this.jobSeekerDao = jobSeekerDao;
		this.validationService = validationService;
	}


	public boolean controlField(JobSeeker jobSeeker) {
		
		if(jobSeeker.getFirstName() != null && jobSeeker.getLastName() != null  && jobSeeker.getNationalIdentity() != null
		   && jobSeeker.getYearOfBirth() != null && jobSeeker.getEmail()!= null && jobSeeker.getPassword() != null ) {
			
			return true;
		}
		
		return false;
	}
	
	public DataResult<JobSeeker> notExistNationalIdentityInDb(String nationalIdentity ) {
		
		if(jobSeekerDao.findByNationalIdentity(nationalIdentity) == null){
			return new SuccessDataResult<JobSeeker>(jobSeekerDao.findByNationalIdentity(nationalIdentity));
			
		}
		return new ErrorDataResult<JobSeeker>(jobSeekerDao.findByNationalIdentity(nationalIdentity));
		
		
	}
	public DataResult<JobSeeker> notExistEmailInDb(String email) {
		if(jobSeekerDao.findByEmail(email) == null){
			return new SuccessDataResult<JobSeeker>(jobSeekerDao.findByEmail(email));
			
		}
		return new ErrorDataResult<JobSeeker>(jobSeekerDao.findByEmail(email));
		
		
	}
	
	@Override
	public Result register(JobSeeker jobSeeker) {
		if(!controlField(jobSeeker)) {
			return new ErrorResult("Mandatory fields must be filled");
		}
		
		if(!checkMernisService.checkIfRealPerson(jobSeeker.getNationalIdentity(), jobSeeker.getFirstName(), jobSeeker.getLastName(), jobSeeker.getYearOfBirth())){
			return new ErrorResult("Invalid User by Mernis Service");
		}
		
		if(!notExistEmailInDb(jobSeeker.getEmail()).isSuccess()) {
			return new ErrorResult("Exist mail in db");
		}
		
		if(!notExistNationalIdentityInDb(jobSeeker.getNationalIdentity()).isSuccess()){
			return new ErrorResult("Exist national identitiy in db");
		}
		//TO DO:  ŞİFRE, ŞİFRE TEKRARI DOĞRULAMASI 
		jobSeekerDao.save(jobSeeker);
		validationService.sendValidation(jobSeeker.getEmail());
		return new SuccesResult("Added job seeker and sent validation code to email. Please check your email");
	}


	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "All jobseeker");
	}

}
