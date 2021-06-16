package kodlamaio.day6HrmsProject.business.abstracts;


import java.util.List;



import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.JobAdvertisement;
import kodlamaio.day6HrmsProject.entities.dtos.JobAdvertisementWithEmployerDto;

public interface JobAdvertisementService {
	Result addAdvertisement(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>>  getByIsActiveTrue();
	DataResult<List<JobAdvertisement>> getAllByDateDesc();
	DataResult<List<JobAdvertisement>> getAllByDateAsc();
	DataResult<List<JobAdvertisementWithEmployerDto>> getJobAdvertisementWithEmployerDetails(String companyName);
	Result updateDeactivateJobAdvertisement(int id);

}
