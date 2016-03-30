package com.zhy.DesignPattern.AbstractFactory;

public interface ICarFactory {
	
    IBody CreateBody();
    IEngine CreateEngine();
    IWheel CreateWheel();
}
