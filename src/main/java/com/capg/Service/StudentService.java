package com.capg.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capg.Model.Student;
import com.capg.Repository.StudentRepo;

@Component
public class StudentService {

	@Autowired
	StudentRepo repo;

	public Student addStudent(Student s) {

		return repo.save(s);

	}
	
	public Student fetchByStudentId(int id)
	{
		return repo.findByStudentId(id);
	}
}
