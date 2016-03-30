#pragma once
#include "ICar.h"

class ICarFactory
{
public:
	virtual	ICar* CreateCar()=0;
};

