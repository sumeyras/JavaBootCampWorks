package kodlamaio.day6HrmsProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.day6HrmsProject.business.abstracts.CoverLetterService;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.CoverLetter;

@RestController
@RequestMapping("/api/cover_letters")
public class CoverLettersController {
	
	private CoverLetterService coverLetterService;

	@Autowired
	public CoverLettersController(CoverLetterService coverLetterService) {

		this.coverLetterService = coverLetterService;
	}
	
	@PostMapping("/addCoverLetter")
	public Result addCoverLetter(@RequestBody CoverLetter coverLetter) {
		
		return this.coverLetterService.addCoverLetter(coverLetter);
	}
	

}
