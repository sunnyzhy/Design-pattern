package com.zhy.DesignPattern.Builder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//建造者模式（Builder）
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director();
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		IBuilder builder= (IBuilder)ctx.getBean("builderPattern");
		((ClassPathXmlApplicationContext)ctx).close();
		director.Constrcut(builder);
		Car car = builder.CreateCar();
	}

}
