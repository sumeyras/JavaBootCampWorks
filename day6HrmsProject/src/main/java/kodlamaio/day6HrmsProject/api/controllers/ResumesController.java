package kodlamaio.day6HrmsProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.day6HrmsProject.business.abstracts.ResumeService;
import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.Resume;


@RestController
@RequestMapping("/api/resumes")
public class ResumesController {
	
	private ResumeService resumeService;

	@Autowired
	public ResumesController(ResumeService resumeService) {

		this.resumeService = resumeService;
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody Resume resume) {
		
		return this.resumeService.add(resume);
	}
	
	@GetMapping("/getByJobSeekerId")
	public DataResult<Resume> getByJobSeekerId(@RequestParam int jobSeekerId){
		
		return this.resumeService.getByJobSeekerId(jobSeekerId);
	}
	

}
