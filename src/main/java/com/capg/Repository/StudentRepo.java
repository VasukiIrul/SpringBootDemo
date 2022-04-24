package com.capg.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.Model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	public Student findByStudentId(int id);
}
