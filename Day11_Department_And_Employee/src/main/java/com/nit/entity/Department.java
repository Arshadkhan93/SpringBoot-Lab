package com.nit.entity;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department {
	
	@Id
	Long id;
	@Column(length = 20)
	String deptName;
	@ElementCollection
	@CollectionTable(name = "Employee" , joinColumns = @JoinColumn(name = "id") )
	List<Employee> employees;

}
