package com.example.springdatajpa;

import com.example.springdatajpa.repos.UserEntityRepo;
import com.example.springdatajpa.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contex = SpringApplication.run(SpringDataJpaApplication.class, args);
//		UserEntityRepo UserEntityRepo = contex.getBean(UserEntityRepo.class);
//		System.out.println(UserEntityRepo.getClass().getName());
		UserService userService = contex.getBean(UserService.class);
		userService.saveUser();
	}

}
