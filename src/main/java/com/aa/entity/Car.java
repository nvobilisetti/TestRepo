package com.aa.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.aa.parts.Engine;
import com.aa.parts.Manufacturer;
import com.aa.parts.Wheel;

@Configuration
@ComponentScan(basePackages="com.aa.parts")
public class Car {
	
	@Autowired
	@Qualifier("Tesla")
	private Manufacturer make;
	
	@Autowired
	@Qualifier("wheel")
	private Wheel wheel;
	
	@Autowired
	//@Qualifier("engine")
	private Engine engine;
	
	private int year;
	private String color;
	
	public Car()
	{
		
	}
	
	public Car(Manufacturer make, Engine engine, Wheel wheel)
	{
		this.make = make;
		this.engine = engine;
		this.wheel = wheel;
	}
	
	public Manufacturer getMake() {
		return make;
	}
	public void setMake(Manufacturer make) {
		this.make = make;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
