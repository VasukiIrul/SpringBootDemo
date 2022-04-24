package com.capg.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.Model.Order;


@Repository
public interface OrderRepo extends JpaRepository<Order, Integer>{

}
