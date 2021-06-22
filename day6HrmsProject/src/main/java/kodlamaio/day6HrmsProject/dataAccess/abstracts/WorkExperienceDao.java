package kodlamaio.day6HrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.day6HrmsProject.entities.concretes.WorkExperience;

public interface WorkExperienceDao extends JpaRepository<WorkExperience, Integer>{

	//TO DO:  Tecrübeler tarih olarak -> DESC
}
