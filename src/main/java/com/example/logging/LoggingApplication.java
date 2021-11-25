package com.example.logging;

//simport org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingApplication {
	//@Autowired
	static
	User user= new User();

	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);
		user.createUser();
		
	}

}
