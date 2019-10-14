package com.sri.springframework.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sri.springframework.Bike;

@Component
public class CarAnno implements IVehicleAnno{
	@Autowired
	private AutoAnno auto;
	
	@Autowired
	private Bike bike;

	public void drive() {
		System.out.println("Driving CarAnno !!");
		auto.print();
		bike.drive();
	}

}
