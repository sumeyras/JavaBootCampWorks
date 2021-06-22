package kodlamaio.day6HrmsProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.day6HrmsProject.business.abstracts.UserService;
import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.entities.concretes.User;


@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {

		this.userService = userService;
	}
	
	@GetMapping("/getById")
	public DataResult<User> getById(@RequestParam int id){
		
		return this.userService.getById(id);
	}
	
	
	

}
