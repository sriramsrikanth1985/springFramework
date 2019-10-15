package com.sri.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		
		//IVehicle obj = new Bike();
		//IVehicle obj = (IVehicle) context.getBean("myCycle");
		IVehicle obj = (IVehicle) context.getBean("vehicle");
		obj.drive();
		
		Tyre tyre = (Tyre) context.getBean("tyre");
		System.out.println("MainClass"+tyre);
		
		tyre.setMake("CEAT");
		System.out.println("After modification MainClass"+tyre);
		
		Tyre tyre1 = (Tyre) context.getBean("tyre");
		System.out.println("another obj MainClass"+tyre1);
		
		Tyre tyre2 = (Tyre) context.getBean("tyre");
		System.out.println("another new obj MainClass"+tyre2);
	}

}
