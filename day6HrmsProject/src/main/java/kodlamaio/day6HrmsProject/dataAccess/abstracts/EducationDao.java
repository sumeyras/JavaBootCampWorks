package kodlamaio.day6HrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.day6HrmsProject.entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education, Integer> {

	//TO DO:  Okullar mezuniyet yılı olarak - >  DESC -- Mezun olmamışsa en üstte
}
