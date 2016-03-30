#pragma once
#include "ICarFactory.h"
#include "AudiEngine.h"
#include "AudiBody.h"
#include "AudiWheel.h"

class AudiFactory : public ICarFactory
{
public:
	IBody *CreateBody();
	IEngine *CreateEngine();
	IWheel *CreateWheel();
};

