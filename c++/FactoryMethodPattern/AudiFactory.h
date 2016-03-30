#pragma once
#include "ICarFactory.h"

class AudiFactory : public ICarFactory
{
public:
	ICar* CreateCar();
};

