package com.capg.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Exception.ResourceNotFoundException;
import com.capg.Model.Employee;
import com.capg.Service.EmployeeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@Autowired
	EmployeeService service;

	@GetMapping("/getEmployee")
	public ResponseEntity<List<Employee>> getEmployee() {
		List<Employee> employee = service.getAllEmployee();
		return new ResponseEntity<List<Employee>>(employee, HttpStatus.OK);

	}

	@PostMapping("/addEmployee")
	@ApiOperation(value = " Store Employee Details")
	public ResponseEntity<String> addEmployee(@Validated @RequestBody Employee e) {

		Employee emp = service.addEmployee(e);

		// return new ResponseEntity<Employee>(emp, HttpStatus.OK);

		return new ResponseEntity<String>("Record inserted successfully", HttpStatus.OK);

	}

	@GetMapping("/fetchByEmail/{EmailId}")
	@ApiOperation(value = " Get Employee by EmailId ")
	public ResponseEntity<Employee> fetchByEmailId(@PathVariable String EmailId) {

		System.out.println(EmailId);
		Employee obj = service.findByEmailId(EmailId);
		System.out.println(obj);
		return new ResponseEntity<Employee>(obj, HttpStatus.OK);
	}

	@GetMapping("/fetchByCity/{city}")
	@ApiOperation(value = " Get Employee By City")
	public ResponseEntity<List<Employee>> fetchByCity(@PathVariable String city) {

		System.out.println(city);
		List<Employee> obj = service.FindEmployeeByCity(city);
		System.out.println(obj);
		return new ResponseEntity<List<Employee>>(obj, HttpStatus.OK);
	}

	@PutMapping("/updateEmployeeById")
//	@ApiOperation(value = "Update Employee Details By their Id")
	public ResponseEntity<String> updateEmployeeById(@RequestBody Employee emp) {

		String status = null;
		Optional<Employee> obj = service.findById(emp.getId());

		if (obj.isPresent()) {
			service.updateEmployeeById(emp);
			status = "Successfully Updated";

		} else {
			throw new ResourceNotFoundException("Given id it's not available in db..");
		}

		return new ResponseEntity<String>(status, HttpStatus.OK);
	}

}
