package com.nit.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nit.entity.Employee;
import com.nit.repo.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	EmployeeRepository repository;
	
	public Page<Employee> fetchEmployee(Pageable pageable)
	{
		
		for(int i=0;i<pageable.getPageSize();i++) {
		
		Pageable pageabl =  pageable;
		}
		
		return repository.findAll(pageable);
		
	}
	
	public Iterable<Employee> fetchEmployeeSorted(Sort sort)
	{
		//Pageable pageable = PageRequest.of(0, 3);
		//Sort sort = ;
		return repository.findAll(sort);
	}

}
