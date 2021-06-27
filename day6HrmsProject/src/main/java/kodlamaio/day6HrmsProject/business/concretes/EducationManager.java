package kodlamaio.day6HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.day6HrmsProject.business.abstracts.EducationService;
import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccesResult;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccessDataResult;
import kodlamaio.day6HrmsProject.dataAccess.abstracts.EducationDao;
import kodlamaio.day6HrmsProject.entities.concretes.Education;

@Service
public class EducationManager implements EducationService{

	private EducationDao educationDao;
	
	@Autowired
	public EducationManager(EducationDao educationDao) {
		this.educationDao = educationDao;
	}



	@Override
	public Result add(Education education) {
		this.educationDao.save(education);
		return new SuccesResult("Eğitim bilgileri kaydedildi.");
	}



	@Override
	public DataResult<List<Education>> getByResumeJobSeekerIdOrderByEndDateDesc(int userId) {
		
		
		return new SuccessDataResult<List<Education>>(educationDao.getByResume_JobSeekerIdOrderByEndDateDesc(userId), "Mezuniyet tarihine göre sıralama DESC");
	}

}
