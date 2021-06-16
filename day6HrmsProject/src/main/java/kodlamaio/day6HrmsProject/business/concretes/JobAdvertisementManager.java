package kodlamaio.day6HrmsProject.business.concretes;



import java.util.List;
import java.util.Objects;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.day6HrmsProject.business.abstracts.JobAdvertisementService;
import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.ErrorResult;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccesResult;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccessDataResult;
import kodlamaio.day6HrmsProject.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.day6HrmsProject.entities.concretes.JobAdvertisement;
import kodlamaio.day6HrmsProject.entities.dtos.JobAdvertisementWithEmployerDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		
		this.jobAdvertisementDao = jobAdvertisementDao;
	}




	public Result controlField(JobAdvertisement jobAdvertisement) {
		
		if(Objects.isNull(jobAdvertisement.getJobDescription()) || Objects.isNull(jobAdvertisement.getNumberOfOpenPosition()) ||
		    jobAdvertisement.getCity().getId()  == 0 || jobAdvertisement.getJobPosition().getId() == 0 )
		{
			return new ErrorResult();
		}
		
		return new SuccesResult();
	}




	@Override
	public Result addAdvertisement(JobAdvertisement jobAdvertisement) {
		if(!controlField(jobAdvertisement).isSuccess()) {
					
			return new ErrorResult("Mandatory fields must be filled");
		}
		
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccesResult("Added Job Advertisement");
	}




	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrue() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActiveTrue(),"active job postings are listed");
	}




	@Override
	public DataResult<List<JobAdvertisement>> getAllByDateDesc() {
		
		
		Sort sort = Sort.by(Sort.Direction.DESC, "createdAt");

		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActiveTrue(sort), "DESC");
	}




	@Override
	public DataResult<List<JobAdvertisement>> getAllByDateAsc() {
		
		Sort sort = Sort.by(Sort.Direction.ASC, "createdAt");

		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActiveTrue(sort), "ASC");
	}




	@Override
	public DataResult<List<JobAdvertisementWithEmployerDto>> getJobAdvertisementWithEmployerDetails(String companyName) {

		return new SuccessDataResult<List<JobAdvertisementWithEmployerDto>>(this.jobAdvertisementDao.getJobAdvertisementWithEmployerDetails(companyName));
	}


	@Override
	public Result updateDeactivateJobAdvertisement(int id) {

		
		this.jobAdvertisementDao.updateDeactivateJobAdvertisement(id);
		return new SuccesResult("Güncellendi");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
