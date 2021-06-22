package kodlamaio.day6HrmsProject.entities.concretes;

import javax.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "cover_letters")
@Entity
public class CoverLetter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "content")
	private String content;
	
	@ManyToOne()
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;

}
