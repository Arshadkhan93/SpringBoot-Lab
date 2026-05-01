package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	


}
