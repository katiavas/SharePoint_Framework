package com.example.ActualProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActualProjectApplication {

	@Autowired
	UserRepository usersRepo;

	public static void main(String[] args) {
		SpringApplication.run(ActualProjectApplication.class, args);
	}

}
