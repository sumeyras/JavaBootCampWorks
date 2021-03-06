package kodlamaio.day6HrmsProject.entities.concretes;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "job_positions")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})

public class JobPosition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "position_name")
	private String positionName;
	
	
	//İlişkilendirme
	
	@OneToMany(mappedBy = "jobPosition")
	private List<JobAdvertisement> jobAdvertisements;
	

}
