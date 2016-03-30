package com.zhy.DesignPattern.AbstractFactory;

public class AudiFactory implements ICarFactory {

	@Override
	public IBody CreateBody() {
		return new AudiBody();
	}
	
	@Override
	public IEngine CreateEngine() {
		return new AudiEngine();
	}
	
	@Override
	public IWheel CreateWheel() {
		return new AudiWheel();
	}
}
