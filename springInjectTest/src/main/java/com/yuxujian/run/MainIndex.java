package com.yuxujian.run;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springInjectTest.Car2;
import springInjectTest.CollectionBean;
import springInjectTest.Person;
import springInjectTest.Car;

public class MainIndex {
	
	@Test
	public void demo1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car.getName());
	}
	
	@Test
	public void demo2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
		Car2 car2 = (Car2) applicationContext.getBean("car2");
		System.out.println(car2.getName());
	}
	
	
	@Test
	public void demo3() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person.getCar2().getName());
		System.out.println(person.getName());
	}
	
	@Test
	public void demo4() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
		CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
		System.out.println(collectionBean.getList());
		System.out.println(collectionBean.getMap());
		System.out.println(collectionBean.getSet());
		System.out.println(collectionBean.getProperties());
	}
}
