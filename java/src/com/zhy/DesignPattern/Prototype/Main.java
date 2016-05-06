package com.zhy.DesignPattern.Prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//原型模式（Prototype）
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		AbstractStudent student= (AbstractStudent)ctx.getBean("prototypePattern");
		((ClassPathXmlApplicationContext)ctx).close();
        System.out.println("student : " + student.getName() + "\t" + student.getAge() + "\t" + student.getCourse().getName());

        System.out.println();
        AbstractStudent student1 = (AbstractStudent)student.Clone();
        student1.setName("Tom");
        student1.setAge(21);
        student1.getCourse().setName("C#");
        System.out.println("student : " + student.getName() + "\t" + student.getAge() + "\t" + student.getCourse().getName());
        System.out.println("student1: " + student1.getName() + "\t" + student1.getAge() + "\t" + student1.getCourse().getName());

        System.out.println();
        student1.getCourse().setName("Java");
        System.out.println("student : " + student.getName() + "\t" + student.getAge() + "\t" + student.getCourse().getName());
        System.out.println("student1: " + student1.getName() + "\t" + student1.getAge() + "\t" + student1.getCourse().getName());
	}

}
