package com.zhy.DesignPattern.Builder;

public class BuilderBenz implements IBuilder{

	private Car car = new Car();
	
	@Override
	public void BuildBody() {
		Body body = new Body();
		body.setDescription("奔驰的车身结构.");
		System.out.println("安装"+body.getDescription());
	}
	
	@Override
	public void BuildEngine() {
		Engine engine = new Engine();
		engine.setDescription("奔驰的发动机.");
		System.out.println("安装"+engine.getDescription());
	}
	
	@Override
	public void BuildWheel() {
		Wheel wheel = new Wheel();
		wheel.setDescription("奔驰的车轮.");
		System.out.println("安装"+wheel.getDescription());
	}
	
	@Override
	public Car CreateCar() {
		System.out.println("奔驰车安装完成.");
		return car;
	}
}
