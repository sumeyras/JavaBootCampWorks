package kodlamaio.day6HrmsProject.entities.concretes;

import javax.persistence.*;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor

@Entity

@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@Table(name = "employers")
public class Employer extends User{
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "web_site")
	private String webSite;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	

}
