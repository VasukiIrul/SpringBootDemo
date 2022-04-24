package com.capg.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "DEPT_MASTER")
public class Department {

	@Id
	private int id;
	private String name;

	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	@JsonManagedReference
	private Set<Employees> employees = new HashSet<>();
	// Initialization required to avoid NullPointerException

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employees> employees) {
		this.employees = employees;
	}

	// the method below will add employee to department
	// also serves the purpose to avoid cyclic references.
	public void addEmployee(Employees employee) {
		employee.setDepartment(this); // this will avoid nested cascade
		this.getEmployees().add(employee);
	}

}
