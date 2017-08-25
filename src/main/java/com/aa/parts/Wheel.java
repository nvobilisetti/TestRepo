package com.aa.parts;

import org.springframework.stereotype.Component;

@Component
public class Wheel {
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private int radius = 185;
	private String type = "alloy";
	
}
