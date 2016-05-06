package com.zhy.DesignPattern.Bridge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//ÇÅ½ÓÄ£Ê½£¨Bridge£©
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		MobilePhone phone = (MobilePhone)ctx.getBean("bridgePattern");
		((ClassPathXmlApplicationContext)ctx).close();
		phone.Run();
	}

}
