package kodlamaio.day6HrmsProject.entities.concretes;



import javax.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "resumes")
@Entity
public class Resume {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "resume_name")
	private String resumeName;
	
	
	/*@OneToOne()
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;*/
	
	

}
