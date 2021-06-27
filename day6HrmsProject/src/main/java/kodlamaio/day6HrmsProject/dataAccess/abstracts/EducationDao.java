package kodlamaio.day6HrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.day6HrmsProject.entities.concretes.Education;


public interface EducationDao extends JpaRepository<Education, Integer> {

	//TO DO:  Okullar mezuniyet yılı olarak - >  DESC -- Mezun olmamışsa en üstte --DONE
	List<Education> getByResume_JobSeekerId(int userId, Sort sort);
}
