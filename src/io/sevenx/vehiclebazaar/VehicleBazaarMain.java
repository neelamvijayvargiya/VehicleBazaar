package io.sevenx.vehiclebazaar;

import java.util.ArrayList;
import java.util.List;

import io.sevenx.vehiclebazaar.data.Bike;
import io.sevenx.vehiclebazaar.data.Car;
import io.sevenx.vehiclebazaar.data.Vehicle;


public class VehicleBazaarMain {
	

		public static void main(String args[]) {
			Vehicle bike=new Bike();
			bike.setBrand("Tata Bazaz");
			bike.setModel("Duke");
			bike.setFuelType("Petrol");
			bike.setMaximumSpeed(110);
			bike.setColor("Orange");
			
			Vehicle car=new Car();
			car.setBrand("Tata");
			car.setModel("Harrier");
			car.setFuelType("Diesel");
			car.setMaximumSpeed(180);
			car.setColor("Grey");
			
			List <Vehicle> vehicle=new ArrayList <Vehicle>();
			vehicle.add(bike);
			vehicle.add(car);
			for(Vehicle v:vehicle) {
				System.out.println("brand is: "+v.getBrand());
				System.out.println("model is: "+v.getModel());
				System.out.println("fuel type is: "+v.getFuelType());
				System.out.println("maximum speed is: "+v.getMaximumSpeed()+"kmph");
				System.out.println("color is: "+v.getColor());
				if (v instanceof Bike) {
					Bike bike1=(Bike)v;
					bike1.setPower(8.36);
					bike1.setNumberOfGears(5);
					System.out.println("power is: "+bike1.getPower()+"PS");
					System.out.println("number of gears are: "+bike1.getNumberOfGears()+"\n");
				}
				else if (v instanceof Car) {
					Car car1=(Car)v;
					car1.setBreakhorsePower(125);
					car1.setTransmissionType("Automatic");
					System.out.println("horse power is: "+car1.getBreakhorsePower()+"kW");
					System.out.println("transmission type is: "+car1.getTransmissionType()+"\n");
					
				}
			}
			}
		}
