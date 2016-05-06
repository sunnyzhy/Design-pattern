package com.zhy.DesignPattern.Adapter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//  ≈‰∆˜ƒ£ Ω£®Adapter£©
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICalculation calculation = new Calculation();
		System.out.println(calculation.Add(1.1, 2.2));
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		calculation= (ICalculation)ctx.getBean("adapterPattern");
		((ClassPathXmlApplicationContext)ctx).close();
		System.out.println(calculation.Add(1.1, 2.2));
	}

}
