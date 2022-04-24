package com.capg.Model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ADDRESS_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;

	@Column(name = "ADDRESS_STREET")
	@NotBlank
	private String street;

	@Column(name = "ADDRESS_CITY")
	private String city;

	@Column(name = "ADDRESS_STATE")
	private String state;

	@Column(name = "ADDRESS_ZIPCODE")
	private String zipCode;

	// to create bi-directional relationship, use one to one with mappedBy
	// mappedBy attribute indicates property name of owner i.e. Student class
	// @OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)

	@JoinColumn(name = "studentId")

	@JsonBackReference

	private Student student;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + ", student=" + student + "]";
	}

	public Address(String street, String city, String state, String zipCode) {
		super();

		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;

	}

	public Address() {
		super();
	}

}
