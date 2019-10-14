package com.sri.springframework.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AutoAnno implements IVehicleAnno{

	public void print() {
		System.out.println("Inside AutoAnno print !!");
	}

	public void drive() {
		System.out.println("Driving AutoAnno !!");
		
	}

}
