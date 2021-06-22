package kodlamaio.day6HrmsProject.entities.concretes;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor

@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@Table(name = "job_seekers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resume","coverLetters","educations","jobExperiences","languages","skills","webSites"})
@Entity
public class JobSeeker extends User{
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "national_identity")
	private String nationalIdentity;
	
	@Column(name = "year_of_birth")
	private String yearOfBirth;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<CoverLetter> coverLetters;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<Education> educations;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<WorkExperience> jobExperiences;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<Language> languages;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<Skill> skills;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<Website> webSites;
	
	/*@OneToOne(mappedBy = "jobSeeker")
	private Resume resume;*/
	

}
