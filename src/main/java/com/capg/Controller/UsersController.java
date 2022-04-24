package com.capg.Controller;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Model.Users;
import com.capg.Service.UsersService;

@RestController
@RequestMapping("/user")
public class UsersController {

	@Autowired
	UsersService service;

	@GetMapping("/getUserByDobAndName/{DOB}/{name}")
	public ResponseEntity<Users> fetchByDobAndName(@PathVariable("DOB") String dateOfBirth,
			@PathVariable("name") String name) throws ParseException {

		DateTimeFormatter df = DateTimeFormatter.ofPattern("d-MM-yyyy");
		// convert String to LocalDate
		LocalDate localDate = LocalDate.parse(dateOfBirth, df);
		System.out.println(localDate);
		System.out.println(name);

		Users user = service.fetchByDobAndName(localDate, name);
		return new ResponseEntity<Users>(user, HttpStatus.OK);

	}

}
