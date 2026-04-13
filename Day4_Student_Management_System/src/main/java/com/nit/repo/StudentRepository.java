package com.nit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>
{
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
