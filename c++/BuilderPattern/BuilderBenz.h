#pragma once
#include "IBuilder.h"

class BuilderBenz : public IBuilder
{
private:
	Car *car;

public:
	BuilderBenz();
	void BuildBody();
	void BuildEngine();
	void BuildWheel();
	Car *CreateCar();
};
