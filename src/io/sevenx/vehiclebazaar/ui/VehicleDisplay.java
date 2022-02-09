package io.sevenx.vehiclebazaar.ui;

import java.util.ArrayList;

import io.sevenx.vehiclebazaar.data.Bike;
import io.sevenx.vehiclebazaar.data.Car;
import io.sevenx.vehiclebazaar.data.Vehicle;


public class VehicleDisplay {

    public static void displayVehicle(ArrayList <Vehicle> vehicles){
        for(Vehicle vehicle: vehicles){
	    System.out.println("Brand: "+ vehicle.getBrand());
            System.out.println("Model: " + vehicle.getModel());
            System.out.println("FuelType: " + vehicle.getFuelType());
            System.out.println("Mileage: " + vehicle.getMileage());
            System.out.println("Maximum Speed: "+ vehicle.getMaximumSpeed());
        
        if(vehicle instanceof Bike){
            Bike bike = (Bike) vehicle;
            System.out.println("number of gears: " + bike.getNumberOfGears());
            System.out.println("Power of bike is: " + bike.getPower());
        }
        if(vehicle instanceof Car){
            Car car = (Car) vehicle;
            System.out.println("BreakhorsePower is: " + car.getBreakhorsePower());
            System.out.println("TransmissionType is: " + car.getTransmissionType());
            

        }

        System.out.println("------------------------------------");
        
        }
    }
    
}
	
