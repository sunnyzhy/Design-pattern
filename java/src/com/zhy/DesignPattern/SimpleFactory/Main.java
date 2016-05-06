package com.zhy.DesignPattern.SimpleFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//¼òµ¥¹¤³§(SimpleFactoryPattern)
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		CarFactory factory= (CarFactory)ctx.getBean("simpleFactoryPattern");
		((ClassPathXmlApplicationContext)ctx).close();
		ICar car = factory.CreateCar();
		car.Print();
	}

}
