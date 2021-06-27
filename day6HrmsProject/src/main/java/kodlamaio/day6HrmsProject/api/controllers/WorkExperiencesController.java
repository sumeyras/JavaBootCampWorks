package kodlamaio.day6HrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.day6HrmsProject.business.abstracts.WorkExperienceService;
import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.WorkExperience;

@RestController
@RequestMapping("/api/work_experiences")
public class WorkExperiencesController {
	
	private WorkExperienceService workExperienceService;

	@Autowired
	public WorkExperiencesController(WorkExperienceService workExperienceService) {
		
		this.workExperienceService = workExperienceService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody WorkExperience workExperience) {
		
		return this.workExperienceService.add(workExperience);
		
	}
	
	@GetMapping("/getAllByIdDESC")
	public DataResult<List<WorkExperience>> getAllByIdDESC(@RequestParam int userId){
		
		return this.workExperienceService.getAllByIdDESC(userId);
	}
	
	

}
