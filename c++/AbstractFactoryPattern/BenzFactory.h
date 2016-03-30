#pragma once
#include "ICarFactory.h"
#include "BenzEngine.h"
#include "BenzBody.h"
#include "BenzWheel.h"

class BenzFactory: public ICarFactory
{
public:
	IBody *CreateBody();
	IEngine *CreateEngine();
	IWheel *CreateWheel();
};
