package kodlamaio.day6HrmsProject.entities.concretes;



import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "resumes")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Resume {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "cover_letter")
	private String coverLetter;

	@JsonManagedReference
	@OneToMany(mappedBy = "resume")
	private List<Education> educations;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "resume")
	private List<WorkExperience> workExperiences;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "resume")
	private List<Language> languages;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "resume")
	private List<Skill> skills;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "resume")
	private List<Website> webSites;
	
	
	@JsonBackReference
	@OneToOne()
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
	
	

}
