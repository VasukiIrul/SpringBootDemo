package com.capg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Model.Student;
import com.capg.Service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	StudentService servcie;

	@PostMapping("/addStudent")

	public ResponseEntity<Student> addStudent(@Validated @RequestBody Student student) {
		Student s = servcie.addStudent(student);

		return new ResponseEntity<Student>(s, HttpStatus.OK);
	}

	@GetMapping("/getStudentById/{studentId}")
	public ResponseEntity<Student> fetchbyStudentId(@PathVariable int studentId) {
		Student s = servcie.fetchByStudentId(studentId);

		return new ResponseEntity<Student>(s, HttpStatus.OK);
	}

}
