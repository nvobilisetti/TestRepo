package com.aa.parts;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String type = "v6";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
