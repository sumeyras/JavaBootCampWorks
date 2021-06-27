package kodlamaio.day6HrmsProject.entities.concretes;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name ="languages")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Language {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "language_name")
	private String languageName;
	
	@Column(name = "language_level")
	private String languageLevel;
	
	@JsonBackReference
	@ManyToOne()
	@JoinColumn(name ="resume_id")
	private Resume resume;

}
