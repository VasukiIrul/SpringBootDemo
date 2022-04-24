package com.capg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Model.Department;
import com.capg.Service.DepartmentService;

@RestController
@RequestMapping("/Department")
public class DepartmentController {

	@Autowired
	DepartmentService service;

	@PostMapping("/addDepartment")
	public ResponseEntity<Department> storeDepartment(@RequestBody Department department) {
		Department departmentObj = service.addDepartment(department);

		return new ResponseEntity<Department>(departmentObj, HttpStatus.OK);

	}

}
