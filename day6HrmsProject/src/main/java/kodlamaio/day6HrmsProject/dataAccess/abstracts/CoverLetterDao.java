package kodlamaio.day6HrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.day6HrmsProject.entities.concretes.CoverLetter;

public interface CoverLetterDao extends JpaRepository<CoverLetter, Integer> {
	
	

}
