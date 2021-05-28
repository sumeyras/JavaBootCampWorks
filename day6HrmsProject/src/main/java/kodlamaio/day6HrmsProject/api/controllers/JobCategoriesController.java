package kodlamaio.day6HrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.day6HrmsProject.business.abstracts.JobCategoryService;
import kodlamaio.day6HrmsProject.entities.concretes.JobCategory;

@RestController
@RequestMapping("/api/job_categories")
public class JobCategoriesController {
	
	JobCategoryService jobCategoryService;
	
	
	@Autowired
	public JobCategoriesController(JobCategoryService jobCategoryService) {
		super();
		this.jobCategoryService = jobCategoryService;
	}
	
	
	@GetMapping("/getall")
	public List<JobCategory> getAll() {
			
		return this.jobCategoryService.getAll();
	}
	
}
