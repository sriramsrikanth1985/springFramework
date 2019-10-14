package com.sri.springframework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cycle implements IVehicle{

	public void drive() {
		System.out.println("Driving cycle !!");
		
	}

}
