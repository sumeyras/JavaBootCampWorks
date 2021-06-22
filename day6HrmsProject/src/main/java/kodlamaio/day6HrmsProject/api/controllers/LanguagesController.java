package kodlamaio.day6HrmsProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.day6HrmsProject.business.abstracts.LanguageService;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		
		this.languageService = languageService;
	}
	
	
	
	@PostMapping("/add")
	public Result add(@RequestBody Language language) {
		
		return this.languageService.add(language);
	}
}
