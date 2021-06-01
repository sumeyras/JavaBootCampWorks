package kodlamaio.day6HrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.day6HrmsProject.business.abstracts.JobPositionService;
import kodlamaio.day6HrmsProject.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/job_positions")
public class JobPositionsController {
	
	JobPositionService jobPositionService;
	
	
	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	
	@GetMapping("/getall")
	public List<JobPosition> getAll() {
			
		return this.jobPositionService.getAll();
	}
	
}
