#pragma once
#include <algorithm>  
#include "Audi.h"
#include "Benz.h"

class CarFactory
{
public:
	string name;
	ICar *CreateCar();
};

