package kodlamaio.day6HrmsProject.entities.dtos;

import java.time.LocalDate;
import java.util.Date;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobAdvertisementWithEmployerDto {
	
	private int id;
	private String companyName;
	private String jobDescription;
	private Integer numberOfOpenPosition;
	private LocalDate applicationDeadline;
	private Date createdAt;
	
}
