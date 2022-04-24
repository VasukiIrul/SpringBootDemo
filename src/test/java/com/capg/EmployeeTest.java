package com.capg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capg.Model.Employee;
import com.capg.Repository.EmployeeRepo;
import com.capg.Service.EmployeeService;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTest {

	@MockBean
	private EmployeeRepo repository;

	@Autowired
	private EmployeeService service;

	// fetchAllEmployee
	@Test
	public void getAllEmployee() {
		when(repository.findAll()).thenReturn(Stream.of(new Employee(123, "vasu", "vasuki.tce@gmail.com", "Chennai"),
				new Employee(34, "Jack", "Shiva.tce@gmail.com", "pune")).collect(Collectors.toList()));

		assertEquals(3, service.getAllEmployee().size());
	}

	// fetchEmployeeByCity
	@Test
	public void getEmployeeByCity() {
		String city = "chennai";
		when(repository.FindEmployeeByCity(city)).thenReturn(
				Stream.of(new Employee(123, "vasu", "vasuki.tce@gmail.com", "chennai")).collect(Collectors.toList()));

		assertEquals(1, service.FindEmployeeByCity(city).size());
	}

	@Test
	public void saveUser() {

		Employee employee = new Employee(12, "Rose", "Rose@gmail.com", "bangalore");
		when(repository.save(employee)).thenReturn(employee);
		assertEquals(employee, service.addEmployee(employee));

	}
}
