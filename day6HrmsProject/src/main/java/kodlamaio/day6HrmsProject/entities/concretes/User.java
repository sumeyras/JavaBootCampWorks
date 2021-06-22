package kodlamaio.day6HrmsProject.entities.concretes;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity

@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","image"})
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;

	
	@OneToOne(mappedBy = "user")
	private UserImage image;

	
	
}
