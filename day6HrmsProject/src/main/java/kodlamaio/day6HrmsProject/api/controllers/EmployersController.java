package kodlamaio.day6HrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.day6HrmsProject.business.abstracts.EmployerService;
import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers_controller")
public class EmployersController {
	
	private EmployerService employerService;

	@Autowired
	public EmployersController(EmployerService employerService) {
		this.employerService = employerService;
	}
	
	
	@PostMapping("/register")
	public Result register(@RequestBody Employer employer) {
		
		return employerService.register(employer);
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		
		return this.employerService.getAll();
	}

}
