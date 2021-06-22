package kodlamaio.day6HrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.day6HrmsProject.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{
	
	

}
