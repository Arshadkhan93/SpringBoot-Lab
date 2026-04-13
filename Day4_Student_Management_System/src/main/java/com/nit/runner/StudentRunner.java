package com.nit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.service.StudentService;

@Component
public class StudentRunner implements CommandLineRunner
{
	@Autowired
	StudentService service;

	@Override
	public void run(String... args) throws Exception {
		IO.println("==== Finder Methods ====");
		IO.println("\n\n   findByCourse(String course)");
		service.findByCourse("Java").forEach(IO::println);
		IO.println("\n\n  findByMarksGreaterThan(Double marks)");
		service.findByMarksGreaterThan(70D).forEach(IO::println);
		IO.println("\n\n  findByMarksBetween(Double min, Double max)");
		service.findByMarksBetween(40D,70D).forEach(IO::println);
		IO.println("\n\n  findByGrade(String grade)");
		service.findByGrade("A").forEach(IO::println);
		IO.println("\n\n  findByCity(String city)");
		service.findByCity("Hyd").forEach(IO::println);
		IO.println("\n\n  findByPassedTrue()");
		service.findByPassedTrue().forEach(IO::println);
		IO.println("\n\n  findByNameStartingWith(String prefix)");
		service.findByNameStartingWith("raj").forEach(IO::println);
		IO.println("\n\n  findByCourseAndPassed(String course, Boolean status)");
		service.findByCourseAndPassed("java",true).forEach(IO::println);
		IO.println("\n\n  findTop3ByOrderByMarksDesc()");
		service.findTop3ByOrderByMarksDesc().forEach(IO::println);
		IO.println("\n\n  findByCityNotIn(List<String> cities)");
		service.findByCityNotIn(List.of("hyderabed","pune")).forEach(IO::println);
	}

}
