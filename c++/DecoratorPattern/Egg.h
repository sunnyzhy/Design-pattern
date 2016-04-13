#pragma once
#include "Ingredients.h"

class Egg : public Ingredients
{
public:
	Egg(Food *food);
	void Cook();
};

