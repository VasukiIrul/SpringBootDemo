package com.capg.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capg.Model.Address;
import com.capg.Repository.AddressRepo;

@Component
@Transactional
public class AddressService {

	@Autowired
	AddressRepo repo;

	public long deleteByCity(String city) {

		return repo.deleteByCity(city);

	}

	public Address findByAddressId(int id) {
		return repo.findByAddressId(id);
	}

	public Address addAddress(Address obj) {
		return repo.save(obj);
	}
}
