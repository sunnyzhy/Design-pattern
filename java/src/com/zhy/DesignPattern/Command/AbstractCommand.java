package com.zhy.DesignPattern.Command;

public abstract class AbstractCommand {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void Cook();
}
