package com.zhy.DesignPattern.AbstractFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		ICarFactory factory= (ICarFactory)ctx.getBean("abstractFactoryPattern");
		((ClassPathXmlApplicationContext)ctx).close();
		IBody body = factory.CreateBody();
        body.Install();
        IEngine engine = factory.CreateEngine();
        engine.Install();
        IWheel wheel = factory.CreateWheel();
        wheel.InstallLeftFrontWheel();
        wheel.InstallRightFrontWheel();
        wheel.InstallLeftBackWheel();
        wheel.InstallRightBackWheel();
	}

}
