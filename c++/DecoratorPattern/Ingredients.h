#pragma once
#include "Food.h"

class Ingredients : public Food
{
public:
	Ingredients(Food *food);

protected:
	Food *food;
};

