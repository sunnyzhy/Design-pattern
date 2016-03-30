#pragma once
#include "Body.h"
#include "Engine.h"
#include "Wheel.h"

class Car
{
public:
	Body *body;
	Engine *engine;
	Wheel *wheel;
};

