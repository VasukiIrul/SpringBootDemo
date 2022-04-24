package com.capg.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capg.Model.Order;
import com.capg.Repository.OrderRepo;

@Component
public class OrderService {

	@Autowired
	OrderRepo repo;
	
	
	public void addOrder(Order o)
	{
		repo.save(o);
	}
}
