package com.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nit.service.DepartmentService;

public class DepartmentRunner implements CommandLineRunner {

	@Autowired
	DepartmentService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		int choice = Integer.parseInt(IO.readln("Enter your choice :"));
		
		switch(choice)
		{
		case 1->{
			
		}
		case 2->{
			
		}
		}
		


		
	}
	
	

}
