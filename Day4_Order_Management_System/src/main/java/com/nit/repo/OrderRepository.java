package com.nit.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>
{
	Iterable<Order> findByCustomerName(String name);
	Iterable<Order> findByStatus(String status);
	Iterable<Order> findByAmountGreaterThan(Double amount);
	Iterable<Order> findByAmountBetween(Double min, Double max);
	Iterable<Order> findByOrderDateAfter(LocalDate date);
	Iterable<Order> findByOrderDateBetween(LocalDate start, LocalDate end);
	Iterable<Order> findByStatusAndAmountGreaterThan(String status, Double amount);
	Iterable<Order> findByProductNameContaining(String keyword);
	Iterable<Order> findTop5ByOrderByOrderDateDesc();
	Iterable<Order> findByStatusIn(List<String> statusList);
}
