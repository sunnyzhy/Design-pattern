package com.zhy.DesignPattern.Decorator;

public class Egg extends Ingredients {

	public Egg(Food food)
	{
		super(food);
		this.setName("����" + this.food.getName());
	}
	
	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		System.out.println(this.getName());
	}
}
