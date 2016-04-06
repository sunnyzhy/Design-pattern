#include "stdafx.h"
#include "CalculationClassAdapter.h"

double CalculationClassAdapter::Add(double x, double y)
{
	int value = CalculationAdaptee::AddMethod((int)x, (int)y);
    return (double)value;
}

