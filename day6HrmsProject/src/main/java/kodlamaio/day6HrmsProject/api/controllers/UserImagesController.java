package kodlamaio.day6HrmsProject.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.day6HrmsProject.business.abstracts.UserImageService;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;

@RestController
@RequestMapping("/api/user_images")
public class UserImagesController {
	
	private UserImageService userImageService;
	
	@Autowired
	public UserImagesController(UserImageService userImageService) {

		this.userImageService = userImageService;

	}
	

	@PostMapping("/imageUpload")
	public Result uploadImage (@RequestBody MultipartFile file, @RequestParam int userId){
		
		return this.userImageService.uploadImage(file, userId);
	} 
	
	
	

}
