package com.capg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capg.Model.Address;
import com.capg.Model.Student;
import com.capg.Repository.StudentRepo;
import com.capg.Service.StudentService;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {

	@MockBean
	private StudentRepo repository;

	@Autowired
	private StudentService service;

	@Test
	public void saveStudent() {

		Address address = new Address("8th street", "tambaram", "Chennai", "8888");
		Student employee = new Student("Rose", address);

		when(repository.save(employee)).thenReturn(employee);
		assertEquals(employee, service.addStudent(employee));

	}

	@Test
	public void saveOnlyStudent() {

		// Address address = new Address("8th street", "tambaram", "Chennai", "8888");
		Student employee = new Student("Rose", null);

		when(repository.save(employee)).thenReturn(employee);
		assertEquals(employee, service.addStudent(employee));

	}

}
