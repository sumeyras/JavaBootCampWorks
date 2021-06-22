package kodlamaio.day6HrmsProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.day6HrmsProject.business.abstracts.LanguageService;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccesResult;
import kodlamaio.day6HrmsProject.dataAccess.abstracts.LanguageDao;
import kodlamaio.day6HrmsProject.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	
	private LanguageDao languageDao;
	
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		
		this.languageDao = languageDao;
	}

	@Override
	public Result add(Language language) {
		
		this.languageDao.save(language);
		return new SuccesResult("Dil bilgileri eklendi");
	}

}
