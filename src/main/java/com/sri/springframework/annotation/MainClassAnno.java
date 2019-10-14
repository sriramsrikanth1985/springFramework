package com.sri.springframework.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClassAnno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IVehicle obj = context.getBean(CarAnno.class);
		//Car obj = new Car();
		obj.drive();
	}

}
