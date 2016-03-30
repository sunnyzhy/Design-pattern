package com.zhy.DesignPattern.Builder;

public class BuilderBenz implements IBuilder{

	private Car car = new Car();
	
	@Override
	public void BuildBody() {
		Body body = new Body();
		body.setDescription("���۵ĳ���ṹ.");
		System.out.println("��װ"+body.getDescription());
	}
	
	@Override
	public void BuildEngine() {
		Engine engine = new Engine();
		engine.setDescription("���۵ķ�����.");
		System.out.println("��װ"+engine.getDescription());
	}
	
	@Override
	public void BuildWheel() {
		Wheel wheel = new Wheel();
		wheel.setDescription("���۵ĳ���.");
		System.out.println("��װ"+wheel.getDescription());
	}
	
	@Override
	public Car CreateCar() {
		System.out.println("���۳���װ���.");
		return car;
	}
}
