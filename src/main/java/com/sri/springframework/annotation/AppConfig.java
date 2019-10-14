package com.sri.springframework.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.sri.springframework.annotation,com.sri.springframework")
public class AppConfig {

}
