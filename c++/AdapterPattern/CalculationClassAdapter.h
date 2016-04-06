#pragma once
#include "ICalculation.h"
#include "CalculationAdaptee.h"

class CalculationClassAdapter : public CalculationAdaptee, public ICalculation
{
public:
	double Add(double x, double y);
};

