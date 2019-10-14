package com.sri.springframework.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClassAnno {
	public static void main(String[] args){
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		IVehicleAnno obj = (IVehicleAnno) factory.getBean(CarAnno.class);
		obj.drive();
	}
}
