package kodlamaio.day6HrmsProject.business.abstracts;

import org.springframework.web.multipart.MultipartFile;


import kodlamaio.day6HrmsProject.core.utilities.results.Result;

public interface UserImageService {
	
	
	Result uploadImage(MultipartFile file, int userId);
	//To Do : 2 parametre alacak biri id diğeri yeni image
	Result updateImageById(int id);

}
