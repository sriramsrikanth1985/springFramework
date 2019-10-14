package com.sri.springframework.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarAnno implements IVehicleAnno{
	@Autowired
	private AutoAnno auto;
	
	public AutoAnno getAuto() {
		return auto;
	}

	public void setAuto(AutoAnno auto) {
		this.auto = auto;
	}

	public void drive() {
		System.out.println("Driving CarAnno !!");
		auto.print();
	}

}
