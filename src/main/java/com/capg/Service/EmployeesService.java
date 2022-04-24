package com.capg.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.Model.Employees;
import com.capg.Repository.EmployeesRepo;

@Service
@Transactional
public class EmployeesService {

	@Autowired
	EmployeesRepo repo;

	public Employees storeEmployee(Employees emp) {
		return repo.save(emp);
	}
}
