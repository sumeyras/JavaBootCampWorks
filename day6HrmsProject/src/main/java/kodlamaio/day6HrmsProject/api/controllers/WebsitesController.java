package kodlamaio.day6HrmsProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.day6HrmsProject.business.abstracts.WebsiteService;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.Website;

@RestController
@RequestMapping("/api/websites")
public class WebsitesController {
	
	private WebsiteService websiteService;

	@Autowired
	public WebsitesController(WebsiteService websiteService) {

		this.websiteService = websiteService;
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody Website website) {
		
		return this.websiteService.add(website);
	}

}
