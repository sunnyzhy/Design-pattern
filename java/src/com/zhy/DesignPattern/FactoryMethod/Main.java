package com.zhy.DesignPattern.FactoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//工厂方法(FactoryMethodPattern)
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		ICarFactory factory= (ICarFactory)ctx.getBean("factoryMethodPattern");
		((ClassPathXmlApplicationContext)ctx).close();
	    ICar car = factory.CreateCar();
		car.Print();
	}

}
