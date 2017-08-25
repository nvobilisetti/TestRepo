package com.aa.parts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Tesla")
public class Manufacturer {
	private String name = "Tesla";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
