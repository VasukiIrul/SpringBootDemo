package com.capg.Repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.Model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

	Users findByDateOfBirthAndName(LocalDate dateOfBirth,String name);
}
