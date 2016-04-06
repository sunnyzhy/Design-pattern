package com.zhy.DesignPattern.Adapter;

public class Calculation implements ICalculation {

	@Override
	public double Add(double x, double y) {

		return x + y;
	}
}
