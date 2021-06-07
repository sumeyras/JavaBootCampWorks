package kodlamaio.day6HrmsProject.entities.concretes;

import javax.persistence.*;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor

@Entity

@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@Table(name = "system_personnels")
public class SystemPersonnel extends User{
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;

}
