package kodlamaio.day6HrmsProject.business.abstracts;

import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.entities.concretes.CoverLetter;

public interface CoverLetterService {
	
	Result addCoverLetter(CoverLetter coverLetter);

}
