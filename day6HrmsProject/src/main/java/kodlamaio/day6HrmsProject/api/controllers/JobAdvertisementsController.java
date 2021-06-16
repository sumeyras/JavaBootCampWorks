package kodlamaio.day6HrmsProject.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.day6HrmsProject.business.abstracts.JobAdvertisementService;
import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.JobAdvertisement;
import kodlamaio.day6HrmsProject.entities.dtos.JobAdvertisementWithEmployerDto;

@RestController
@RequestMapping("/api/jobAdvertisements_controller")
public class JobAdvertisementsController {

	
	
	private JobAdvertisementService jobAdvertisementService;

	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {

		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	
	@PostMapping("/addAdvertisement")
	public Result addAdvertisement(@RequestBody JobAdvertisement jobAdvertisement) {
		
		return jobAdvertisementService.addAdvertisement(jobAdvertisement);
	}
	
	@GetMapping("/getByIsActiveTrue")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrue(){
		return this.jobAdvertisementService.getByIsActiveTrue();
	}
	
	@GetMapping("/getAllByDateDesc")
	public DataResult<List<JobAdvertisement>> getAllByDateDesc(){
		
		return this.jobAdvertisementService.getAllByDateDesc();
	}
	
	@GetMapping("/getAllByDateAsc")
	public DataResult<List<JobAdvertisement>> getAllByDateAsc(){
		
		return this.jobAdvertisementService.getAllByDateAsc();
	}
	
	@GetMapping("/getJobAdvertisementWithEmployerDetails")
	public DataResult<List<JobAdvertisementWithEmployerDto>> getJobAdvertisementWithEmployerDetails(@RequestParam String companyName){
		
		return this.jobAdvertisementService.getJobAdvertisementWithEmployerDetails(companyName);
		
	}
	
	@PostMapping("/updateDeactivateJobAdvertisement")
	public Result updateDeactivateJobAdvertisement(@RequestParam int id) {

		return this.jobAdvertisementService.updateDeactivateJobAdvertisement(id);
	}
	
	
}
