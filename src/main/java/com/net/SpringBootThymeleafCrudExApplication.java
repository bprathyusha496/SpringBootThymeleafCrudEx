package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.net.*")

public class SpringBootThymeleafCrudExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeleafCrudExApplication.class, args);
		System.out.println("jenkings with github...");
	}
	
	
}



