package kodlamaio.day6HrmsProject.entities.concretes;

import java.time.LocalDate;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "work_experiences")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class WorkExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "position_name")
	private String positionName;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name ="start_date")
	private LocalDate startDate;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name ="end_date")
	private LocalDate endDate;
	
	@JsonBackReference
	@ManyToOne()
	@JoinColumn(name ="resume_id")
	private Resume resume;

}
