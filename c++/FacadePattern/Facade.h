#pragma once
#include "Noodles.h"
#include "Water.h"
#include "Tomato.h"
#include "Egg.h"
#include "Pepper.h"

class Facade
{
public:
	Facade();
	void Cook();
private:
	Noodles noodles;
    Water water;
    Tomato tomato;
    Egg egg;
    Pepper pepper;
};

