package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class Bike {
	@Autowired
	private Yamaha R15;
	String color;
	public Bike()
	{
		this.color="green";
	}
	public void Colour()
	{
		System.out.println("its colour "+color);
		R15.speed();
	}
	
}
