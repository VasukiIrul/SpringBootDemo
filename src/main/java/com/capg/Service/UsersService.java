package com.capg.Service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.Model.Users;
import com.capg.Repository.UserRepo;

@Service
public class UsersService {

	@Autowired
	UserRepo repo;
	
	
	public Users fetchByDobAndName(LocalDate DOB,String name)
	{
		Users user= repo.findByDateOfBirthAndName(DOB,name);
		System.out.println(user);
		return user;
	}
}
