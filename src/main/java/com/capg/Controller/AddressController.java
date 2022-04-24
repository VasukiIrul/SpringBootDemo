package com.capg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Model.Address;
import com.capg.Service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	AddressService service;

	@GetMapping("/fetchByAddress/{addressId}")
	public ResponseEntity<Address> findByAddressId(@PathVariable int addressId) {

		Address address = service.findByAddressId(addressId);

		return new ResponseEntity<Address>(address, HttpStatus.OK);
	}
	
	@PostMapping("/addAddress")
	
	public ResponseEntity<Address> storeAddress(@RequestBody Address adresss)
	{
		Address address=service.addAddress(adresss);
		return new ResponseEntity<Address>(address,HttpStatus.OK);
	}

}
