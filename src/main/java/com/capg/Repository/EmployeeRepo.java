package com.capg.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capg.Model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	Optional<Employee> findById(int id);

	public Employee findByEmailId(String emailId);

	@Query(value = "select e from Employee e where e.city = :city")
	List<Employee> FindEmployeeByCity(@Param("city") String city);

	/*
	 * @Query("select e from Employee e where e.salary > :salary") List<Employee>
	 * findBySalary(@Param("salary") double salary);
	 */
	/*
	 * @Modifying
	 * 
	 * @Query("update Employee e set e.name = ?1, e.city = ?2 where e.id = ?3") void
	 * setEmployeeById(String name, String city, Integer id);
	 */

}
