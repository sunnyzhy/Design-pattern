package com.zhy.DesignPattern.Adapter;

public class CalculationObjectAdapter implements ICalculation {

	private CalculationAdaptee calculation;
	
	public CalculationObjectAdapter(CalculationAdaptee calculation) {

		this.calculation=calculation;
	}
	
	@Override
	public double Add(double x, double y) {

		int value = this.calculation.AddMethod((int)x, (int)y);
        return (double)value;
	}
}
