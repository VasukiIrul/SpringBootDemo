package com.capg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Model.Employees;
import com.capg.Service.EmployeesService;

@RestController
@RequestMapping("/Employees")
public class EmployeesController {

	@Autowired
	EmployeesService service;

	@PostMapping("/addEmployeeDetails")

	public ResponseEntity<Employees> storeEmployees(@RequestBody Employees employee)

	{
		Employees employeeObj = service.storeEmployee(employee);
		return new ResponseEntity<Employees>(employeeObj, HttpStatus.OK);
	}

}
