package kodlamaio.day6HrmsProject.entities.concretes;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name ="skills")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "skill_name")
	private String skillName;
	
	@JsonBackReference
	@ManyToOne()
	@JoinColumn(name ="resume_id")
	private Resume resume;

}
