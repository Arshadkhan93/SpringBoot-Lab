package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@RequiredArgsConstructor
@Table(name = "profile12")
public class Profile {
	
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@Column(length = 20)
	@NonNull
	String phone;
	@Column(length = 20)
	@NonNull
	String address;



}
