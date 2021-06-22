package kodlamaio.day6HrmsProject.entities.concretes;

import javax.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "websites")
@Entity
public class Website {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "website_name")
	private String websiteName;
	
	@Column(name = "website_url")
	private String websiteUrl;
	
	
	@ManyToOne()
	@JoinColumn(name ="job_seeker_id")
	private JobSeeker jobSeeker;

}
