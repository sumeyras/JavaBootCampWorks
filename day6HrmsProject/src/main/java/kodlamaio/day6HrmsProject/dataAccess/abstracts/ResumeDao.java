package kodlamaio.day6HrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.day6HrmsProject.entities.concretes.Resume;

public interface ResumeDao extends JpaRepository<Resume, Integer> {
	
	//Resume getByJobSeeker_Id(int jobSeekerId);

}
