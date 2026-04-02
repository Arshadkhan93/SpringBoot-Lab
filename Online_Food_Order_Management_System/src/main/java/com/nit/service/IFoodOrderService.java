package com.nit.service;

import java.util.Optional;

import com.nit.entity.FoodOrder;

public interface IFoodOrderService 
{
	FoodOrder save(FoodOrder order);
	Iterable<FoodOrder> saveAll(Iterable<FoodOrder> orders);
	Optional<FoodOrder> findById(Long id);
	Iterable<FoodOrder> findAll();
	Iterable<FoodOrder> findAll(Iterable<Long> ids);
	
	boolean existsById(Long id);
	Long count();
	
	//Delete
	void delete(FoodOrder order);
	void deleteAllById(Iterable<Long> ids);
	void deleteAll();
	void deleteAll(Iterable<? extends FoodOrder> order);
	
	
	
	

}
