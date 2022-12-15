package com.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootThymeleafCrudExApplication extends SpringBootServletInitializer {
	
@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder initializer) {
	  return initializer.sources(SpringBootThymeleafCrudExApplication.class);
		
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeleafCrudExApplication.class, args);
		System.out.println("jenkings with github...");
	}
	
	
}



