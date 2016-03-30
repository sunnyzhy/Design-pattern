package com.zhy.DesignPattern.Main;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.zhy.DesignPattern.Singleton.Singleton;
//import com.zhy.DesignPattern.Prototype.AbstractStudent;
//import com.zhy.DesignPattern.Prototype.DeepStudentSerialize;
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

	public static void main(String[] args) throws CloneNotSupportedException {

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
//        System.out.println("student : " + student.name + "\t" + student.age + "\t" + student.course.getName());
//
//        System.out.println();
//        AbstractStudent student1 = (AbstractStudent)student.Clone();
//        student1.name = "Tom";
//        student1.age = 21;
//        student1.course.setName("C#");
//        System.out.println("student : " + student.name + "\t" + student.age + "\t" + student.course.getName());
//        System.out.println("student1: " + student1.name + "\t" + student1.age + "\t" + student1.course.getName());
//
//        System.out.println();
//        student1.course.setName("Java");
//        System.out.println("student : " + student.name + "\t" + student.age + "\t" + student.course.getName());
//        System.out.println("student1: " + student1.name + "\t" + student1.age + "\t" + student1.course.getName());
		
		//单例模式（Singleton）
//		Singleton instance = Singleton.GetInstance();
//		instance.Print();
	}

}
