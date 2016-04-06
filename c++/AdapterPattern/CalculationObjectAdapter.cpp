#include "stdafx.h"
#include "CalculationObjectAdapter.h"


CalculationObjectAdapter::CalculationObjectAdapter(CalculationAdaptee *calculation)
{
	this->calculation = calculation;
}

double CalculationObjectAdapter::Add(double x, double y)
{
	int value = this->calculation->AddMethod((int)x, (int)y);
    return (double)value;
}