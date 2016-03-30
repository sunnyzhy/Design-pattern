package com.zhy.DesignPattern.FactoryMethod;

public class BenzFactory implements ICarFactory{

	@Override
	public ICar CreateCar() {
		return new Benz();
	}
}
