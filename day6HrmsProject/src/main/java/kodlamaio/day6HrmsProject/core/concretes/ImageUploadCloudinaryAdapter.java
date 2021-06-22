package kodlamaio.day6HrmsProject.core.concretes;


import java.io.IOException;
import java.util.Map;



import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.day6HrmsProject.core.adapters.abstracts.ImageUploadService;
import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.ErrorDataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccessDataResult;


import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Service
public class ImageUploadCloudinaryAdapter implements ImageUploadService{
	
	private Cloudinary cloudinary;

	public ImageUploadCloudinaryAdapter() {
		this.cloudinary = new Cloudinary(ObjectUtils.asMap("cloud_name", "dmlvxfppq",
														   "api_key", "928661727982634",
														   "api_secret", "rhj_WGYD1ZiEg9xli87wOGTlngE"));
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	@Override
	public DataResult<Map> imageUpload(MultipartFile file) {
		
		try {
			//file.getBytes() --> Convert MultipartFile to File
			Map uploadResult = (Map<String,?>)cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
			
			return new SuccessDataResult<Map>(uploadResult);
			
		}
		catch(IOException exception) {
			exception.printStackTrace();
		}
		return new ErrorDataResult<Map>();
	}

}
