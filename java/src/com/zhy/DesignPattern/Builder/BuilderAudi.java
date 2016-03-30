package com.zhy.DesignPattern.Builder;

public class BuilderAudi implements IBuilder{

	private Car car = new Car();
	
	@Override
	public void BuildBody() {
		Body body = new Body();
		body.setDescription("�µϵĳ���ṹ.");
		System.out.println("��װ"+body.getDescription());
	}
	
	@Override
	public void BuildEngine() {
		Engine engine = new Engine();
		engine.setDescription("�µϵķ�����.");
		System.out.println("��װ"+engine.getDescription());
	}
	
	@Override
	public void BuildWheel() {
		Wheel wheel = new Wheel();
		wheel.setDescription("�µϵĳ���.");
		System.out.println("��װ"+wheel.getDescription());
	}
	
	@Override
	public Car CreateCar() {
		System.out.println("�µϳ���װ���.");
		return car;
	}
}
