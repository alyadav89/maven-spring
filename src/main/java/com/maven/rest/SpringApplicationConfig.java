package com.maven.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/*@ComponentScan(basePackages={
		"com.maven.repository",
		"com.maven.model",
		"com.maven.rest"})*/
@SpringBootApplication
public class SpringApplicationConfig {

	public static void main(String[] args) {
		SpringApplication.run(SpringApplicationConfig.class);
		 BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16); // Strength set as 16
	        String encodedPassword = encoder.encode("123432");
	        System.out.println("BCryptPasswordEncoder");
	        System.out.println(encodedPassword);
	        System.out.println("\n");
	}

}
