package com.nit.service;

import java.util.Optional;

import com.nit.entity.Travel;

public interface ITravelService 
{
	void addTravel(Travel travel);
	Iterable<Travel> getAllTravels();
	Optional<Travel> findTravelById(Long id);
	void deleteTravleById(Long id);
	boolean existsById(Long id);
	long count();
	void delete(Travel travel);
	void deleteAll();
	

}
