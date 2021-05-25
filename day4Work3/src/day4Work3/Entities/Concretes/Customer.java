package day4Work3.Entities.Concretes;

import java.time.LocalDate;

import day4Work3.Entities.Abstracts.IEntity;

public class Customer implements IEntity {
	
	private int id;
	private String firstname;
	private String lastname;
	private LocalDate dateOfBirth;
	private String nationalityId;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Customer(int id, String firstname, String lastname, LocalDate dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getNationalityId() {
		return nationalityId;
	}



	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	

}
