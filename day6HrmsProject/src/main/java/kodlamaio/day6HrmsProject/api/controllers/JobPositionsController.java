package kodlamaio.day6HrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.day6HrmsProject.business.abstracts.JobPositionService;
import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/job_positions")
public class JobPositionsController {
	
	private JobPositionService jobPositionService;
	
	
	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		this.jobPositionService = jobPositionService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<JobPosition>>getAll() {
			
		return this.jobPositionService.getAll();
	}
	
	
	@PostMapping("/addposition")
	public Result add(@RequestBody JobPosition jobPosition) {
		
		return this.jobPositionService.add(jobPosition);
	}
	
}
