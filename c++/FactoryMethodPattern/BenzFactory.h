#pragma once
#include "ICarFactory.h"

class BenzFactory : public ICarFactory
{
public:
	ICar *CreateCar();
};

