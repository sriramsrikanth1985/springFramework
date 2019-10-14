package com.sri.springframework.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public CarAnno getCar(){
		return new CarAnno();
	}
}
