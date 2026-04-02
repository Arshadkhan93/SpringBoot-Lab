
package com.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.controller.FoodOrderController;
import com.nit.entity.FoodOrder;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;

@Component
public class OrderRunner implements CommandLineRunner
{
	@Autowired
	FoodOrderController controller;

	@Override
	public void run(String... args) throws Exception 
	{
		while(true)
		{
			IO.println("1. Add Order\r\n"
					+ "2. Add Multiple Orders\r\n"
					+ "3. View All Orders\r\n"
					+ "4. View Orders by IDs\r\n"
					+ "5. Find Order by ID\r\n"
					+ "6. Check Order Exists\r\n"
					+ "7. Count Orders\r\n"
					+ "8. Delete Order by ID\r\n"
					+ "9. Delete Orders by IDs\r\n"
					+ "10. Delete Specific Order\r\n"
					+ "11. Delete Selected Orders\r\n"
					+ "12. Delete All Orders\r\n"
					+ "13. Exit");
			
			int choice = Integer.parseInt(IO.readln("Enter Choice :"));
			
			switch(choice)
			{
			case 1->
			{
				Long id = Long.parseLong(IO.readln("Enter ID: "));
				String customerName = IO.readln("Enter Customer Name: ");
				String foodItem = IO.readln("Enter Item Name : ");
				Integer quantity= Integer.parseInt(IO.readln("Enter Quantity: "));
				Double pricePerItem = Double.parseDouble(IO.readln("Enter Price Per Item: "));
				controller.save(new FoodOrder(id, customerName, foodItem, quantity, pricePerItem, pricePerItem));			
			}
			}
		}
		
		
	}

}
