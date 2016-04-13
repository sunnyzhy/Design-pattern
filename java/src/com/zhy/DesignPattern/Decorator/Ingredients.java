package com.zhy.DesignPattern.Decorator;

public abstract class Ingredients extends Food {

	protected Food food;
	
	public Ingredients(Food food)
	{
		this.food = food;
	}
}
