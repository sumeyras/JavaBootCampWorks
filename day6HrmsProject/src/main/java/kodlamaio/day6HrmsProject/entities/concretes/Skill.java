package kodlamaio.day6HrmsProject.entities.concretes;

import javax.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name ="skills")
@Entity
public class Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "skill_name")
	private String skillName;
	
	@ManyToOne()
	@JoinColumn(name ="job_seeker_id")
	private JobSeeker jobSeeker;

}
