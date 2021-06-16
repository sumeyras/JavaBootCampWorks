package kodlamaio.day6HrmsProject.entities.concretes;




import java.time.LocalDate;

import java.util.Date;


import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "job_advertisements")
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	
	@Column(name = "job_description")
	private String jobDescription;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@Column(name = "number_of_open_position" )
	private Integer numberOfOpenPosition;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "application_deadline")
	private LocalDate applicationDeadline;
	
	@Column(name = "created_at")
	private final Date createdAt =  new Date(System.currentTimeMillis());
	
	@Column(name = "is_active")
	private boolean isActive;
	
	
	//İlişkilendirme yapılacak tablolar
	
	@ManyToOne()
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City city;

	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;

}
