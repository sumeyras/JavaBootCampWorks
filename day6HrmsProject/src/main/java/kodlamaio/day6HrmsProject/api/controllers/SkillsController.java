package kodlamaio.day6HrmsProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.day6HrmsProject.business.abstracts.SkillService;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.Skill;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {
	
	private SkillService skillService;

	
	@Autowired
	public SkillsController(SkillService skillService) {
		
		this.skillService = skillService;
	}
	
	
	
	@PostMapping("/add")
	public Result add(@RequestBody Skill skill) {
		
		return this.skillService.add(skill);
	}
	
	

}
