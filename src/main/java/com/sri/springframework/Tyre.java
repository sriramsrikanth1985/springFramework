package com.sri.springframework;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
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
