#pragma once
#include "IBuilder.h"

class BuilderAudi : public IBuilder
{
private:
	Car *car;

public:
	BuilderAudi();
	void BuildBody();
	void BuildEngine();
	void BuildWheel();
	Car *CreateCar();
};

