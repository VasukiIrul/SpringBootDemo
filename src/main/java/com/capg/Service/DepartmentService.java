package com.capg.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capg.Model.Department;
import com.capg.Repository.DepartmentRepo;

@Component
public class DepartmentService {

	@Autowired

	DepartmentRepo repo;
	
	
	public Department addDepartment(Department department)
	{
		//countnoof records
		
		return repo.save(department);
	}

}
