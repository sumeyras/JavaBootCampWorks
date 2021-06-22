package kodlamaio.day6HrmsProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.day6HrmsProject.business.abstracts.SkillService;
import kodlamaio.day6HrmsProject.core.utilities.results.Result;
import kodlamaio.day6HrmsProject.core.utilities.results.SuccesResult;
import kodlamaio.day6HrmsProject.dataAccess.abstracts.SkillDao;
import kodlamaio.day6HrmsProject.entities.concretes.Skill;

@Service
public class SkillManager implements SkillService {

	private SkillDao skillDao;
	
	
	@Autowired
	public SkillManager(SkillDao skillDao) {
		
		this.skillDao = skillDao;
	}
	
	
	
	@Override
	public Result add(Skill skill) {
		this.skillDao.save(skill);
		return new SuccesResult("Yetenekler eklendi");
	}

}
