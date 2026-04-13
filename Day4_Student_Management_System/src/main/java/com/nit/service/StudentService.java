package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Student;
import com.nit.repo.StudentRepository;

@Service
public class StudentService implements IStudentService
{
	@Autowired
	StudentRepository repository;

	@Override
	public Iterable<Student> findByCourse(String course) {
		
		return repository.findByCourse(course);
	}

	@Override
	public Iterable<Student> findByMarksGreaterThan(Double marks) {
	
		return repository.findByMarksGreaterThan(marks);
	}

	@Override
	public Iterable<Student> findByMarksBetween(Double min, Double max) {
		
		return repository.findByMarksBetween(min, max);
	}

	@Override
	public Iterable<Student> findByGrade(String grade) {
		return repository.findByGrade(grade);
	}

	@Override
	public Iterable<Student> findByCity(String city) {
		
		return repository.findByCity(city);
	}

	@Override
	public Iterable<Student> findByPassedTrue() {
		
		return repository.findByPassedTrue();
	}

	@Override
	public Iterable<Student> findByNameStartingWith(String prefix) {
		
		return repository.findByNameStartingWith(prefix);
	}

	@Override
	public Iterable<Student> findByCourseAndPassed(String course, Boolean status) {
		
		return repository.findByCourseAndPassed(course, status);
	}

	@Override
	public Iterable<Student> findTop3ByOrderByMarksDesc() {
		
		return repository.findTop3ByOrderByMarksDesc();
	}

	@Override
	public Iterable<Student> findByCityNotIn(List<String> cities) {
		
		return repository.findByCityNotIn(cities);
	}
	

}
