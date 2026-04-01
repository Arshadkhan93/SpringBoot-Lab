package com.nit.entity;

import org.hibernate.annotations.CollectionId;
import org.springframework.stereotype.Component;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CheckConstraint;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Component
@Table(name = "Food_Order_Tab")
public class FoodOrder {
	@Id
	Long id;
	@Column(length = 20)
	@Nonnull
	String customerName;
	String foodItem;
	Integer quantity;
	Double pricePerItem;
	Double totalAmount;

}
