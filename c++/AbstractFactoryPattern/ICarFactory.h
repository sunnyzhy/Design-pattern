#pragma once
#include "IEngine.h"
#include "IBody.h"
#include "IWheel.h"

class ICarFactory
{
public:
	virtual IBody *CreateBody()=0;
	virtual IEngine *CreateEngine()=0;
	virtual IWheel *CreateWheel()=0;
};

