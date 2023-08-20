package com.velocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.velocity.service.UserService;

@SpringBootApplication
public class Octssb1Application {

	public static void main(String[] args) {
   
	ConfigurableApplicationContext context = SpringApplication.run(Octssb1Application.class, args);
	 UserService bean = context.getBean(UserService.class);
	 bean.getName(101);
	 
	 
	}

}
