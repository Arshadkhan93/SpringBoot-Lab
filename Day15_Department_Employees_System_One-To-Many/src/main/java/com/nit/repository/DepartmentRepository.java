package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> 
{

}
