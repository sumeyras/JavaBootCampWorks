package kodlamaio.day6HrmsProject.entities.concretes;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})

public class City {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "city_name")
	private String cityName;
	
	//İlişkilendirme
	
	@OneToMany(mappedBy = "city")
	private List<JobAdvertisement> jobAdvertisements;

}
