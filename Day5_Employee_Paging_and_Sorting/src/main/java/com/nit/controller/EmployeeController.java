package com.nit.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;

import com.nit.Service.EmployeeService;
import com.nit.entity.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	public Page<Employee> fetchEmployee(Pageable pages)
	{
		return service.fetchEmployee(pages);
	}
	
	public void fetchEmpSort(Sort sort)
	{
		service.fetchEmployeeSorted(sort).forEach(IO::println);
	}
}
