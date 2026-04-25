package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Customer;
import com.nit.repo.CustomerRepository;

@Service
public class CustomerService implements ICustomerService{
	
	@Autowired
	CustomerRepository repository;
	
	public void saveCustomer(Customer customer)
	{
		repository.save(customer);
	}
	
	public List<Customer> fetchData()
	{
		return repository.findAll();
	}
	
	public void deleteCustomer(Long id)
	{
		repository.deleteById(id);
	}

}
