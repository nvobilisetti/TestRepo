package com.aa.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import com.aa.parts.Engine;
import com.aa.parts.EntertainmentSystem;
import com.aa.parts.Manufacturer;
import com.aa.parts.Wheel;

@Component
public class Van {
	
	@Autowired
	@Qualifier("toyota")
	private Manufacturer make;
	
	@Autowired
	private Wheel wheel;
	
	@Autowired
	private Engine engine;
	
	private int year;
	private String color;
	
	private EntertainmentSystem res;
	
	public Van()
	{
		
	}
	
	public Van(Manufacturer make, Engine engine, Wheel wheel)
	{
		this.make = make;
		this.engine = engine;
		this.wheel = wheel;
	}
	
	
	
	public EntertainmentSystem getRes() {
		return res;
	}

	//@Autowired
	//@Autowired(required=false)
	@Required
	public void setRes(EntertainmentSystem res) {
		this.res = res;
	}

	public Manufacturer getMake() {
		return make;
	}
	public void setMake(Manufacturer make) {
		System.out.println("Van : set Make called " + make.getName());
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
	
	@Autowired
	@Required
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
