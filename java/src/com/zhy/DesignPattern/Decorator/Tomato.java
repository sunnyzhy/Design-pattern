package com.zhy.DesignPattern.Decorator;

public class Tomato extends Ingredients {

	public Tomato(Food food)
	{
		super(food);
		this.setName("Î÷ºìÊÁ" + this.food.getName());
	}
	
	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		System.out.println(this.getName());
	}
}
