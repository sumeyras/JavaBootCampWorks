package kodlamaio.day6HrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.day6HrmsProject.entities.concretes.JobPosition;


public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
	
	JobPosition findByPositionNameIgnoreCase(String positionName);

}
