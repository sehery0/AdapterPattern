package UserProject.entities;

import java.time.LocalDate;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private int birthYear;
	
	
	public User() {
		super();
	}


	public User(int id, String firstName, String lastName, String identityNumber, int birthYear) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthYear = birthYear;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getIdentityNumber() {
		return identityNumber;
	}


	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}


	public int getbirthYear() {
		return birthYear;
	}


	public void setbirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	
	
}
