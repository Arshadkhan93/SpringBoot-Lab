package com.nit.service;

import java.util.List;

import com.nit.entity.Department;
import com.nit.entity.Employee;

public interface IService {
	
//	Add Department
	String add(Department dept);
//	Add Employees to Department
	String add(List<Employee> emps,Department dept);
//	Get Employees by Department
	List<Employee> getEmpByDept(Department dept);
//	Get Employees with salary > 50,000
	List<Employee> getEmpBySalaryRange(Double salary);
	

}
