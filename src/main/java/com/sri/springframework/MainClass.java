package com.sri.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		
		//IVehicle obj = new Bike();
		IVehicle obj = (IVehicle) context.getBean("car");
		obj.drive();
		
		Tyre tyre = (Tyre) context.getBean("tyre");
		System.out.println("MainClass"+tyre);
	}

}
