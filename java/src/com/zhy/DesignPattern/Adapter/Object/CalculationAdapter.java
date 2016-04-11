package com.zhy.DesignPattern.Adapter.Object;

import com.zhy.DesignPattern.Adapter.CalculationAdaptee;
import com.zhy.DesignPattern.Adapter.ICalculation;

public class CalculationAdapter implements ICalculation  {

    private CalculationAdaptee calculation;

    public CalculationAdapter(CalculationAdaptee calculation)
    {
        this.calculation = calculation;
    }
    
	@Override
	public double Add(double x, double y) {
		// TODO Auto-generated method stub
		int value = this.calculation.AddMethod((int)x, (int)y);
        return (double)value;
	}
}
