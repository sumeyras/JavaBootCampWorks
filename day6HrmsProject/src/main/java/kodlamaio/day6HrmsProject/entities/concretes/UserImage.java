package kodlamaio.day6HrmsProject.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "images")
@Entity
public class UserImage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	@Column(name = "created_at")
	private LocalDate createdAt = LocalDate.now();
	
	@Column(name = "image_available")
	private Boolean isImageAvailable;
	
	@OneToOne()
	@JoinColumn(name = "user_id")
	private User user;

}
