package com.nit.service;

import java.util.List;

import com.nit.entity.Student;

public interface IStudentService {
	Iterable<Student> findByCourse(String course);
	Iterable<Student> findByMarksGreaterThan(Double marks);
	Iterable<Student> findByMarksBetween(Double min, Double max);
	Iterable<Student> findByGrade(String grade);
	Iterable<Student> findByCity(String city);
	Iterable<Student> findByPassedTrue();
	Iterable<Student> findByNameStartingWith(String prefix);
	Iterable<Student> findByCourseAndPassed(String course, Boolean status);
	Iterable<Student> findTop3ByOrderByMarksDesc();
	Iterable<Student> findByCityNotIn(List<String> cities);

}
