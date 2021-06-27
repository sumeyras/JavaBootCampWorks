package kodlamaio.day6HrmsProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.day6HrmsProject.business.abstracts.ResumeService;
import kodlamaio.day6HrmsProject.core.utilities.results.DataResult;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccesResult;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccessDataResult;
import kodlamaio.day6HrmsProject.dataAccess.abstracts.ResumeDao;
import kodlamaio.day6HrmsProject.entities.concretes.Resume;

@Service
public class ResumeManager implements ResumeService {

	private ResumeDao resumeDao;
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao) {

		this.resumeDao = resumeDao;
	}


	@Override
	public Result add(Resume resume) {

		this.resumeDao.save(resume);
		return new SuccesResult("Cv Kaydedildi");
	}


	@Override
	public DataResult<Resume> getByJobSeekerId(int jobSeekerId) {
		
		return new SuccessDataResult<Resume>(this.resumeDao.getByJobSeekerId(jobSeekerId), "Cv görüntülendi");
	}


}
