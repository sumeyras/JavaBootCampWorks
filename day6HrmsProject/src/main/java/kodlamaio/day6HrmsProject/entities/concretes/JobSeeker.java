package kodlamaio.day6HrmsProject.entities.concretes;

import javax.persistence.*;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor


@Entity

@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@Table(name = "job_seekers")
public class JobSeeker extends User{
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "national_identity")
	private String nationalIdentity;
	
	@Column(name = "year_of_birth")
	private String yearOfBirth;

}
