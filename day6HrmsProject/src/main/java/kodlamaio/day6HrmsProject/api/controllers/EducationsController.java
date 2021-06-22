package kodlamaio.day6HrmsProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.day6HrmsProject.business.abstracts.EducationService;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.Education;

@RestController
@RequestMapping("/api/educations")
public class EducationsController {
	
	private EducationService educationService;

	
	@Autowired
	public EducationsController(EducationService educationService) {
		
		this.educationService = educationService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Education education) {
		
		return this.educationService.add(education);
	}
	
	

}
