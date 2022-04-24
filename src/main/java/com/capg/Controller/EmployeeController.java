package com.capg.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capg.Model.Employee;
import com.capg.Service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@RequestMapping("/addStudent")
	public @ResponseBody String addEmployee(Employee e) {

		String msg = null;
		System.out.println(e);

		Employee emp = service.addEmployee(e);

		if (emp.getId() != 0) {
			// System.out.print(emp.getId()+" has been registerd successfully");
			msg = emp.getId() + " has been registerd successfully";

		} else {
			msg = "data not stored successfully";
		}

		return msg;

	}

	@RequestMapping("/findByEmailId")
	@ResponseBody
	public Employee fetchByEmailId(@RequestParam String emaild) {
		//System.out.println(emaild);
		Employee e = service.findByEmailId(emaild);
		return e;
	}

	@RequestMapping("/findByCity")
	@ResponseBody
	public List<Employee> fetchByCity(@RequestParam String city) {
		System.out.println(city);
		List<Employee> e = service.FindEmployeeByCity(city);
		System.out.println(e);
		return e;
	}

}
