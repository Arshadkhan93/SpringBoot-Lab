package com.nit.runner;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.controller.TravelController;
import com.nit.entity.Travel;

@Component
public class TravelApplicationRunner implements CommandLineRunner
{
	@Autowired
	private TravelController controller;

	@Override
	public void run(String... args) throws Exception 
	{
		
		while(true)
		{
		IO.println("1.Add a new travel booking.\r\n"
				+ "2.Retrieve all travel bookings.\r\n"
				+ "3.Find a travel booking by ID.\r\n"
				+ "4.Delete a travel booking by ID.\r\n"
				+ "5.Check if a travel booking exists.\r\n"
				+ "6.Count total travel bookings.\r\n"
				+ "7.Delete a specific travel booking.\r\n"
				+ "8.Delete all travel bookings.\r\n"
				+ "9.Exit.");
		
		int choice = Integer.parseInt(IO.readln());
		
		switch(choice)
		{
		case 1 ->
		{
			 Long id= Long.parseLong(IO.readln("Enter ID"));
			 String destination = IO.readln("Enter Destination");
			 String transportationMode = IO.readln("Enter Transportation MOde:");
			 Double price = Double.parseDouble(IO.readln("Enter Destination"));
			 controller.addTravel(new Travel(id, destination, transportationMode, price));
				
		}
		case 2->
		{
			Iterable<Travel> allTravels = controller.getAllTravels();
			Stream.of(allTravels).forEach(t ->IO.println(t) );
		}
		case 3->
		{
			Long id = Long.parseLong(IO.readln("Enter ID"));
			Optional<Travel> travelById = controller.findTravelById(id);
			travelById.ifPresent(t->IO.println("Traveller Is:\n"+t));			
		}
		case 4->
		{
			Long id = Long.parseLong(IO.readln("Enter ID"));
			Optional<Travel> travelById = controller.findTravelById(id);			
		}
		case 5->
		{
			Long id = Long.parseLong(IO.readln("Enter ID"));
			boolean existsById = controller.existsById(id);
			if(existsById)
				IO.println("Traveler Exist!!");
			else
			IO.println("Traveler Not Exist!!");
		}
		case 6->
		{
			long count = controller.count();
			IO.println("Total Traveller Booking :"+count);
		}
		case 7->
		{
			Long id = Long.parseLong(IO.readln("Enter ID"));
			controller.deleteTravleById(id);
		}
		case 8->
		{
			controller.deleteAll();
		}
		case 9->
		{
			IO.println("Closing Application!!!");
			System.exit(0);
		}
		}
	}
		
		
		
	}

}
