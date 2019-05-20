package com.pgrsoft.gestionparking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//class Config
@Configuration
public class DemoConfig {
	
	public DemoConfig() {
		System.out.println("Clase Demo Config instanciada.");
	}
	
	@Bean
	public String texto() {
		System.out.println("Entramos en texto()");
		return "Soy un texto";
	}
	
}
