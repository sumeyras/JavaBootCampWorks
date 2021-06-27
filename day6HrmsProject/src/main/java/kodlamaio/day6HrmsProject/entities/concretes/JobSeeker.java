package kodlamaio.day6HrmsProject.entities.concretes;



import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor

@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@Table(name = "job_seekers")

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class JobSeeker extends User{
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "national_identity")
	private String nationalIdentity;
	
	@Column(name = "year_of_birth")
	private String yearOfBirth;
	

	@JsonManagedReference
	@OneToOne(mappedBy = "jobSeeker")
	private Resume resume;
	

}
