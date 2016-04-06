package com.zhy.DesignPattern.Adapter;

public class CalculationClassAdapter extends CalculationAdaptee implements ICalculation {

	@Override
	public double Add(double x, double y) {

		int value = super.AddMethod((int)x, (int)y);
        return (double)value;
	}
}
