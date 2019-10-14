package com.sri.springframework;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	public Tyre() {
		super();
	}

	public Tyre(String make) {
		super();
		this.make = make;
	}
	
	public Tyre(String make, String make2) {
		super();
		this.make = make;
		System.out.println("make2 is only for printing:"+make2);
	}
	
	public Tyre(String make, int make2) {
		super();
		this.make = make;
		System.out.println("make2 is only for printing:"+make2);
	}
	
	public Tyre(int make, String make2) {
		super();
		this.make = make2;
		System.out.println("make2 is used only for printing:"+make);
	}



	private String make;

	@Override
	public String toString() {
		return "Tyre [make=" + make + "]";
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
}
