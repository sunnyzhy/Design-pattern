package com.zhy.DesignPattern.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhy.DesignPattern.Decorator.Egg;
import com.zhy.DesignPattern.Decorator.Food;
import com.zhy.DesignPattern.Decorator.Noodles;
import com.zhy.DesignPattern.Decorator.Tomato;

//import com.zhy.DesignPattern.Bridge.MobilePhone;
//import com.zhy.DesignPattern.Bridge.MobilePhoneApp;

//import com.zhy.DesignPattern.Composite.Transparent.Composite;
//import com.zhy.DesignPattern.Composite.Transparent.Leaf;

//import com.zhy.DesignPattern.Adapter.Calculation;
//import com.zhy.DesignPattern.Adapter.ICalculation;

//import com.zhy.DesignPattern.Singleton.Singleton;

//import com.zhy.DesignPattern.Prototype.AbstractStudent;

//import com.zhy.DesignPattern.Builder.Car;
//import com.zhy.DesignPattern.Builder.Director;
//import com.zhy.DesignPattern.Builder.IBuilder;

//import com.zhy.DesignPattern.SimpleFactory.CarFactory;
//import com.zhy.DesignPattern.SimpleFactory.ICar;

//import com.zhy.DesignPattern.FactoryMethod.ICar;
//import com.zhy.DesignPattern.FactoryMethod.ICarFactory;

//import com.zhy.DesignPattern.AbstractFactory.IBody;
//import com.zhy.DesignPattern.AbstractFactory.ICarFactory;
//import com.zhy.DesignPattern.AbstractFactory.IEngine;
//import com.zhy.DesignPattern.AbstractFactory.IWheel;

public class Main {

	public static void main(String[] args) {

		//简单工厂(SimpleFactoryPattern)
//		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//		CarFactory factory= (CarFactory)ctx.getBean("simpleFactoryPattern");
//		((ClassPathXmlApplicationContext)ctx).close();
//		ICar car = factory.CreateCar();
//		car.Print();
		
		//工厂方法(FactoryMethodPattern)
//		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//		ICarFactory factory= (ICarFactory)ctx.getBean("factoryMethodPattern");
//		((ClassPathXmlApplicationContext)ctx).close();
//	    ICar car = factory.CreateCar();
//		car.Print();
		
		//抽象工厂(AbstractFactoryPattern)
//		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//		ICarFactory factory= (ICarFactory)ctx.getBean("abstractFactoryPattern");
//		((ClassPathXmlApplicationContext)ctx).close();
//		IBody body = factory.CreateBody();
//        body.Install();
//        IEngine engine = factory.CreateEngine();
//        engine.Install();
//        IWheel wheel = factory.CreateWheel();
//        wheel.InstallLeftFrontWheel();
//        wheel.InstallRightFrontWheel();
//        wheel.InstallLeftBackWheel();
//        wheel.InstallRightBackWheel();
		
		//建造者模式（Builder）
//		Director director = new Director();
//		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//		IBuilder builder= (IBuilder)ctx.getBean("builderPattern");
//		((ClassPathXmlApplicationContext)ctx).close();
//		director.Constrcut(builder);
//		Car car = builder.CreateCar();
		
		//原型模式（Prototype）
//		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//		AbstractStudent student= (AbstractStudent)ctx.getBean("prototypePattern");
//		((ClassPathXmlApplicationContext)ctx).close();
//        System.out.println("student : " + student.getName() + "\t" + student.getAge() + "\t" + student.getCourse().getName());
//
//        System.out.println();
//        AbstractStudent student1 = (AbstractStudent)student.Clone();
//        student1.setName("Tom");
//        student1.setAge(21);
//        student1.getCourse().setName("C#");
//        System.out.println("student : " + student.getName() + "\t" + student.getAge() + "\t" + student.getCourse().getName());
//        System.out.println("student1: " + student1.getName() + "\t" + student1.getAge() + "\t" + student1.getCourse().getName());
//
//        System.out.println();
//        student1.getCourse().setName("Java");
//        System.out.println("student : " + student.getName() + "\t" + student.getAge() + "\t" + student.getCourse().getName());
//        System.out.println("student1: " + student1.getName() + "\t" + student1.getAge() + "\t" + student1.getCourse().getName());
		
		//单例模式（Singleton）
//		Singleton instance = Singleton.GetInstance();
//		instance.Print();
		
		//适配器模式（Adapter）
//		ICalculation calculation = new Calculation();
//		System.out.println(calculation.Add(1.1, 2.2));
//		
//		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//		calculation= (ICalculation)ctx.getBean("adapterPattern");
//		((ClassPathXmlApplicationContext)ctx).close();
//		System.out.println(calculation.Add(1.1, 2.2));
		
		//桥接模式（Bridge）
//		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//		MobilePhone phone = (MobilePhone)ctx.getBean("bridgePattern");
//		((ClassPathXmlApplicationContext)ctx).close();
//		phone.Run();
		
		//组合模式（Composite）
//		Composite root = new Composite("root", 0);
//        Composite node1 = new Composite("node1", 1);
//        node1.Add(new Leaf("leaf10", 2));
//        node1.Add(new Leaf("leaf11", 2));
//        root.Add(node1);
//
//        Composite node2 = new Composite("node2", 1);
//        node2.Add(new Leaf("leaf20", 2));
//        Composite node3 = new Composite("node21", 2);
//        node3.Add(new Leaf("leaf22", 3));
//        node2.Add(node3);
//        root.Add(node2);
//
//        System.out.println(root.getName());
//        root.Display(root);
		
		//装饰模式（Decorator）
		Food noodles = new Noodles();
        Egg egg = new Egg(noodles);
        Tomato tomato = new Tomato(egg);
        tomato.Cook();
	}

}
