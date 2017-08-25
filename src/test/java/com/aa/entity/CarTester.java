package com.aa.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aa.parts.Wheel;

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext annotationContext = new AnnotationConfigApplicationContext(Car.class);
		ApplicationContext xmlContext = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		System.out.println("new line added");
		
		
	/*	Wheel wheel = (Wheel)annotationContext.getBean("wheel");
		System.out.println(wheel.getRadius());
		wheel.setRadius(200);
		
		Wheel wheel2 = (Wheel)annotationContext.getBean("wheel");
		System.out.println(wheel2.getRadius());*/
		
		Car car = (Car)annotationContext.getBean("car");
		System.out.printf("Car Make is %s, engine is %s, running on wheel with radius %d",
				car.getMake().getName(), car.getEngine().getType(), car.getWheel().getRadius() );
		
		car = (Car)xmlContext.getBean("hondaCar");
		System.out.printf("\nCar Make is %s, engine is %s, running on wheel with radius %d",
				car.getMake().getName(), car.getEngine().getType(), car.getWheel().getRadius() );
		Van van = (Van)xmlContext.getBean("van");
		System.out.printf("\nVan Make is %s, engine is %s, running on wheel with radius %d",
				van.getMake().getName(), van.getEngine().getType(), van.getWheel().getRadius() );
		
		van = (Van)xmlContext.getBean("modelx");
		System.out.printf("\nVan Make is %s, engine is %s, running on wheel with radius %d",
				van.getMake().getName(), van.getEngine().getType(), van.getWheel().getRadius() );
	}

}
