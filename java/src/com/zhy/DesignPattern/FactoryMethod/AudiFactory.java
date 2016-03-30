package com.zhy.DesignPattern.FactoryMethod;

public class AudiFactory implements ICarFactory {

	@Override
	public ICar CreateCar() {
		return new Audi();
	}
}
