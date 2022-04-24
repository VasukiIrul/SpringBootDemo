package com.capg.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.Model.Employee;
import com.capg.Repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo repo;

	
	public List<Employee> getAllEmployee()
	{
		return repo.findAll();
	}
	public Employee addEmployee(Employee e) {

		return repo.save(e);

	}

	public Employee findByEmailId(String emaild) {
		return repo.findByEmailId(emaild);

	}

	public List<Employee> FindEmployeeByCity(String city) {
		List<Employee> emp = repo.FindEmployeeByCity(city);
		return emp;
	}

	public void updateEmployeeById(Employee e) {
		repo.save(e);
	}

	public Optional<Employee> findById(int id) {
		return repo.findById(id);
	}

}
