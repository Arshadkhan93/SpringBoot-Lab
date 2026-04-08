package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EMP_TAB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	Long id;
	String name;
	String designation;
	Double salary;

}
