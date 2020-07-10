package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.Data;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DemoSpringBootApplication.class, args);
		System.out.println("hello");
		Bike bk=context.getBean( Bike.class);
		bk.Colour();
	}

}
