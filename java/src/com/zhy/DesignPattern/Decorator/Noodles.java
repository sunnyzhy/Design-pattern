package com.zhy.DesignPattern.Decorator;

public class Noodles extends Food {

	public Noodles()
	{
		this.setName("ÃæÌõ");
	}
	
	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		System.out.println(this.getName());
	}
}
