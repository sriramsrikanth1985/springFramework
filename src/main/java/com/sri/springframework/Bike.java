package com.sri.springframework;

import org.springframework.stereotype.Component;

@Component
public class Bike implements IVehicle{
	public void drive() {
		System.out.println("Driving Bike !!");
	}

}
