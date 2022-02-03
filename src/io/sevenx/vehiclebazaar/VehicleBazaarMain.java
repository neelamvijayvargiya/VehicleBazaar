package io.sevenx.vehiclebazaar;

import java.util.ArrayList;
import java.util.List;

import io.sevenx.vehiclebazaar.data.Bike;
import io.sevenx.vehiclebazaar.data.Car;
import io.sevenx.vehiclebazaar.data.Vehicle;
public class VehicleBazaarMain {

      public static void main(String[] args) {
    	  	
			Vehicle vehicle = new Vehicle();
			vehicle.setModel("Scorpio");
			vehicle.setBrand("Mahindra");
			vehicle.setColor("Black");
			vehicle.setFuelType("Petrol");
			System.out.println("Model: " + vehicle.getModel());
			System.out.println("Brand: " + vehicle.getBrand());
			System.out.println("Color: " + vehicle.getColor());
			System.out.println("FuelType: " + vehicle.getFuelType());
			
			
			Car car = new Car();
			car.setModel("Harrier");
			car.setBrand("Tata MOtors");
			car.setColor("Black");
			car.setFuelType("Diesel");
			System.out.println("Model: " + vehicle.getModel());
			System.out.println("Brand: " + vehicle.getBrand());
			System.out.println("Color: " + vehicle.getColor());
			System.out.println("FuelType: " + vehicle.getFuelType());
			
			
			Bike bike = new Bike();
			bike.setModel("Duke");
			bike.setBrand("Bajaj Auto");
			bike.setColor("Orange");
			bike.setFuelType("Petrol");
			System.out.println("Model: " + vehicle.getModel());
			System.out.println("Brand: " + vehicle.getBrand());
			System.out.println("Color: " + vehicle.getColor());
			System.out.println("FuelType: " + vehicle.getFuelType());
			
			List<Vehicle> list = new ArrayList<Vehicle>();
			list.add(bike);
			list.add(car);
		     }
	
	}
