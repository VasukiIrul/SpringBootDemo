package com.capg.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.Model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

	public long deleteByCity(String city);

	public Address findByAddressId(int id);

}
