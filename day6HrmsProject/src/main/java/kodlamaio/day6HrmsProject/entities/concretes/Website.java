package kodlamaio.day6HrmsProject.entities.concretes;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "websites")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Website {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "website_name")
	private String websiteName;
	
	@Column(name = "website_url")
	private String websiteUrl;
	
	@JsonBackReference
	@ManyToOne()
	@JoinColumn(name ="resume_id")
	private Resume resume;

}
