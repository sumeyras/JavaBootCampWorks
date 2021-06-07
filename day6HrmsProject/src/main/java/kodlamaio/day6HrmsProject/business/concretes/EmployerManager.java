package kodlamaio.day6HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.day6HrmsProject.business.abstracts.EmployerService;
import kodlamaio.day6HrmsProject.core.Validation.abstracts.ValidationService;
import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.ErrorDataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.ErrorResult;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccesResult;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccessDataResult;
import kodlamaio.day6HrmsProject.dataAccess.abstracts.EmployerDao;
import kodlamaio.day6HrmsProject.entities.concretes.Employer;


@Service
public class EmployerManager implements EmployerService{

	
	private EmployerDao employerDao;
	private ValidationService validationService;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao, ValidationService validationService) {
		super();
		this.employerDao = employerDao;
		this.validationService = validationService;
	}

	
	public Result controlField(Employer employer){
		
		if(employer.getCompanyName() !=null && employer.getEmail() !=null && employer.getPhoneNumber() !=null && 
		   employer.getWebSite() !=null && employer.getPassword() !=null) {
			
			return new SuccesResult();
		}
		return new ErrorResult();
	}


	public Result webSiteDomainControl(String webSite, String email ) {
		
		String emailSplit = email.split("@")[1];
		
		if(!webSite.contains(emailSplit)) {
			
			return new ErrorResult();
		}
	
		return new SuccesResult();
	}
	
	public DataResult<Employer> notExistEmailInDb(String email) {
		if(employerDao.findByEmail(email) == null){
			
			return new SuccessDataResult<Employer>(employerDao.findByEmail(email));
			
		}
		
		return new ErrorDataResult<Employer>(employerDao.findByEmail(email));
		
	}
	
	
	@Override
	public Result register(Employer employer) {
		
		if(!controlField(employer).isSuccess()) {
			
			return new ErrorResult("Mandatory fields must be filled");
			
		}
		
		if(!webSiteDomainControl(employer.getWebSite(), employer.getEmail()).isSuccess()) {
			
			return new ErrorResult("Email domain and your website domain must be same");
		}
		
		if(!notExistEmailInDb(employer.getEmail()).isSuccess()){
			
			return new ErrorResult("Exist mail in db");
		}
		
		/*TO DO:  
		 * ŞİFRE, ŞİFRE TEKRARI DOĞRULAMASI 
		 * HRMS VALIDATION
		 * */
		employerDao.save(employer);
		validationService.sendValidation(employer.getEmail());
		return new SuccesResult("Added Employer into system and sent validation code to email. Please check your email");
	}


	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "All employer");
	}
	
	

}
