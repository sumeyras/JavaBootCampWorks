package kodlamaio.day6HrmsProject.dataAccess.abstracts;

import java.util.List;



import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import kodlamaio.day6HrmsProject.entities.concretes.JobAdvertisement;
import kodlamaio.day6HrmsProject.entities.dtos.JobAdvertisementWithEmployerDto;

@Transactional //SpringBoot'un JPA gereksinimlerinde, veritabanı verilerinin güncellenmesi ve silinmesi gerekiyorsa işlem desteği gereklidir.
			  //Yani, bunun işlem düzeyinde bir işlem olduğunu göstermek için işlem katmanına @Transactional eklenir.
public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	
	List<JobAdvertisement> getByIsActiveTrue();
	List<JobAdvertisement> getByIsActiveTrue(Sort sort);
	
	//JPQL
	@Query("Select new kodlamaio.day6HrmsProject.entities.dtos.JobAdvertisementWithEmployerDto"+
		   "(j.id, e.companyName, j.jobDescription, j.numberOfOpenPosition, j.applicationDeadline, j.createdAt)"+
	       " From Employer e Inner Join e.jobAdvertisements j Where e.companyName=:companyName")
	List<JobAdvertisementWithEmployerDto> getJobAdvertisementWithEmployerDetails(@Param("companyName") String companyName);

	@Modifying
	@Query("update JobAdvertisement j Set j.isActive = false Where j.id=:id")
	void updateDeactivateJobAdvertisement(@Param("id") int id);
	
	
}
