package com.capg.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.Model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
