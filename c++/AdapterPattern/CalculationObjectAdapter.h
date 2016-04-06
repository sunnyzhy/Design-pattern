#pragma once
#include "ICalculation.h"
#include "CalculationAdaptee.h"

class CalculationObjectAdapter : public ICalculation
{
private:
	CalculationAdaptee *calculation;

public:
	CalculationObjectAdapter(CalculationAdaptee *calculation);
	double Add(double x, double y);
};

