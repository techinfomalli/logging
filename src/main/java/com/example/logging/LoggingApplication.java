package com.example.logging;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LoggingApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(LoggingApplication.class,args);
	
		User user= context.getBean(User.class);
		user.createUser();
		
		
	}

}
