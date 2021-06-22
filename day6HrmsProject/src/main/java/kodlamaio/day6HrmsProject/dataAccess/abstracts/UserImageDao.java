package kodlamaio.day6HrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import kodlamaio.day6HrmsProject.entities.concretes.UserImage;

@Transactional
public interface UserImageDao extends JpaRepository<UserImage, Integer>{
	
	// To Do: Foto güncelleme
	//@Modifying
	

}
