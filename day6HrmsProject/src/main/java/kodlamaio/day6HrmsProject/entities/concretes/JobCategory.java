package kodlamaio.day6HrmsProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "job_categories")
public class JobCategory {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "category_name")
	private String categoryName;
	
	
	public JobCategory() {}

	public JobCategory(int id, String categoryName) {
		super();
		this.id = id;
		this.categoryName = categoryName;
	}


}
