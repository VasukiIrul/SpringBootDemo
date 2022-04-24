package com.capg.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	private int userId;
	private String name;
	private String password;
	private String confirmPassword;
	private String emailId;
	// @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	// @Column(columnDefinition ="Date")
	private LocalDate dateOfBirth;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", name=" + name + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", emailId=" + emailId + ", dateOfBirth=" + dateOfBirth + "]";
	}

	public Users(int userId, String name, String password, String confirmPassword, String emailId,
			LocalDate dateOfBirth) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.emailId = emailId;
		this.dateOfBirth = dateOfBirth;
	}

	public Users() {
		super();
	}

}
