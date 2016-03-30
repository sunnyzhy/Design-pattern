package com.zhy.DesignPattern.AbstractFactory;

public class BenzFactory implements ICarFactory {

	@Override
	public IBody CreateBody() {
		return new BenzBody();
	}
	
	@Override
	public IEngine CreateEngine() {
		return new BenzEngine();
	}
	
	@Override
	public IWheel CreateWheel() {
		return new BenzWheel();
	}
}
