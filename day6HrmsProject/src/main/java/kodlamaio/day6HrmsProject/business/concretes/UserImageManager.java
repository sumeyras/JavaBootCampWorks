package kodlamaio.day6HrmsProject.business.concretes;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.day6HrmsProject.business.abstracts.UserImageService;
import kodlamaio.day6HrmsProject.core.adapters.abstracts.ImageUploadService;
import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.ErrorResult;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccesResult;
import kodlamaio.day6HrmsProject.dataAccess.abstracts.UserDao;
import kodlamaio.day6HrmsProject.dataAccess.abstracts.UserImageDao;
import kodlamaio.day6HrmsProject.entities.concretes.UserImage;


@Service
public class UserImageManager implements UserImageService{

	private UserImageDao userImageDao;
	private UserDao userDao;
	private ImageUploadService imageUploadService;
	
	
	
	@Autowired
	public UserImageManager(UserImageDao userImageDao, UserDao userDao, ImageUploadService imageUploadService) {
		this.userImageDao = userImageDao;
		this.userDao = userDao;
		this.imageUploadService = imageUploadService;
		
	}
	
	
	
	@SuppressWarnings({"rawtypes"})
	@Override
	public Result uploadImage(MultipartFile file, int userId) {
		
		DataResult<Map> uploadResult = this.imageUploadService.imageUpload(file);
		
		if(uploadResult.getData() != null) {
			
			UserImage userImage = new UserImage();
			userImage.setImageUrl(uploadResult.getData().get("url").toString());
			userImage.setIsImageAvailable(true);
			userImage.setUser(userDao.getById(userId));
			
			this.userImageDao.save(userImage);
			
			return new SuccesResult("Başarılı bir şekilde image sisteme yüklendi");
		}
		
		return new ErrorResult("UserImageManager uploadResult null");
	}
	
	

	@Override
	public Result updateImageById(int id) {
		// TO DO :  UserImageDao güncelleme 
		return new SuccesResult("güncellendi");
	}



}
