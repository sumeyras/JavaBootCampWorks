package kodlamaio.day6HrmsProject.core.adapters.abstracts;


import java.util.Map;


import org.springframework.web.multipart.MultipartFile;

import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;


public interface ImageUploadService {
	
	@SuppressWarnings("rawtypes")
	DataResult<Map> imageUpload(MultipartFile file);

}
