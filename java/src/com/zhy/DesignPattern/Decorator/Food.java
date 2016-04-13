package com.zhy.DesignPattern.Decorator;

public abstract class Food {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void Cook();
}
