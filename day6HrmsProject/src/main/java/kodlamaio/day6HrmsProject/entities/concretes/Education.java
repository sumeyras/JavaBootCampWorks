package kodlamaio.day6HrmsProject.entities.concretes;


import java.time.LocalDate;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "educations")

public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name ="school_name")
	private String schoolName;
	
	@Column(name ="faculty_name")
	private String facultyName;
	
	@Column(name ="department_name")
	private String departmentName;
	
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name ="start_date")
	private LocalDate startDate;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name ="end_date")
	private LocalDate endDate;
	
	
	
	/*public String getEndDate() {
		if (endDate == null) {
			
			return "Devam Ediyor";
		}
		return endDate.toString();
	}*/
	

	@JsonBackReference
	@ManyToOne()
	@JoinColumn(name ="resume_id")
	private Resume resume;
	
}
	
	
