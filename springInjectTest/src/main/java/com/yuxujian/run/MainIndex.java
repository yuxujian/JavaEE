package com.yuxujian.run;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springInjectTest.Car;

public class MainIndex {
	
	@Test
	public void demo1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car.getName());
	}
}
