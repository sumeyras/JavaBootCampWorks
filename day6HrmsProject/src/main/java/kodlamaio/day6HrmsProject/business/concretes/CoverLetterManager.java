package kodlamaio.day6HrmsProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.day6HrmsProject.business.abstracts.CoverLetterService;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccesResult;
import kodlamaio.day6HrmsProject.dataAccess.abstracts.CoverLetterDao;
import kodlamaio.day6HrmsProject.entities.concretes.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService{

	private CoverLetterDao coverLetterDao;
	
	
	@Autowired
	public CoverLetterManager(CoverLetterDao coverLetterDao) {

		this.coverLetterDao = coverLetterDao;
	}

	
	
	@Override
	public Result addCoverLetter(CoverLetter coverLetter) {
		coverLetterDao.save(coverLetter);
		return new SuccesResult("cover letter kaydedildi");
	}

}
