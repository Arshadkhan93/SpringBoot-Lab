package com.nit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Travel;
import com.nit.repo.TravelRepository;

@Service
public class TravelService implements ITravelService
{
	@Autowired
	private TravelRepository repository;

	@Override
	public void addTravel(Travel travel) 
	{		
		repository.save(travel);		
	}

	@Override
	public Iterable<Travel> getAllTravels() {
		
		return repository.findAll();
	}

	@Override
	public Optional<Travel> findTravelById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void deleteTravleById(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public boolean existsById(Long id) {
		
		return repository.existsById(id);
	}

	@Override
	public long count() {
		return repository.count();
	}

	@Override
	public void delete(Travel travel) {
		repository.delete(travel);
		
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
		
	}

}
