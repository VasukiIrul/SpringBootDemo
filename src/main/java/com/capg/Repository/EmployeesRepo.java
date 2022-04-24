package com.capg.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.Model.Employees;

@Repository
public interface EmployeesRepo extends JpaRepository<Employees, Integer> {

}
