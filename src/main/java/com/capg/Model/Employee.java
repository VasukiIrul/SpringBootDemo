package com.capg.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
//@Api(value="Employee" ,description = "Employee management Service")
public class Employee {

	@Id
	//@ApiModelProperty(value="this is the employee Id")
	private int id;

	@Column(name = "name", nullable = false)
	@NotBlank
	@Size(min = 2, message = "user name must have atleast two character")
	//@ApiModelProperty(value="this is the employee Name")
	private String name;

	@NotNull(message = "email filed must not be empty")
	@Email(message = "email should be in valid format")
	//@ApiModelProperty(value="this is the employee EmailId")
	private String emailId;

	@NotEmpty
	@Size(max = 10, message = "city name should be between 1 to 10 character.. ")
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emailId=" + emailId + ", city=" + city + "]";
	}

	public Employee(int id, @NotEmpty @Size(min = 2, message = "user name must have atleast two character") String name,
			@NotNull(message = "email filed must not be empty") @Email(message = "email should be in valid format") String emailId,
			@NotEmpty @Size(max = 10, message = "city name should be between 1 to 10 character.. ") String city) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.city = city;
	}

	public Employee() {
		super();
	}
	
	
	
	

}
