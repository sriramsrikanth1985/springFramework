package com.sri.springframework.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public CarAnno getCarAnno(){
		return new CarAnno();
	}
	
	@Bean
	public AutoAnno getAuto(){
		return new AutoAnno();
	}
}
