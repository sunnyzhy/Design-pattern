#pragma once
#include "Ingredients.h"

class Tomato : public Ingredients
{
public:
	Tomato(Food *food);
	void Cook();
};

