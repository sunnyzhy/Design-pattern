package com.zhy.DesignPattern.Adapter.Class;

import com.zhy.DesignPattern.Adapter.CalculationAdaptee;
import com.zhy.DesignPattern.Adapter.ICalculation;

public class CalculationAdapter extends CalculationAdaptee implements ICalculation {

	@Override
	public double Add(double x, double y) {
		// TODO Auto-generated method stub
		 int value = super.AddMethod((int)x, (int)y);
         return (double)value;
	}
}
