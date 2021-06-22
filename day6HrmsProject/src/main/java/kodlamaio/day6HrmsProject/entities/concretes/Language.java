package kodlamaio.day6HrmsProject.entities.concretes;

import javax.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name ="languages")
@Entity
public class Language {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "language_name")
	private String languageName;
	
	@Column(name = "language_level")
	private String languageLevel;
	
	@ManyToOne()
	@JoinColumn(name ="job_seeker_id")
	private JobSeeker jobSeeker;

}
