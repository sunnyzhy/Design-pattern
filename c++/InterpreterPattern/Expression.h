#pragma once
#include "Context.h"

class Expression
{
public:
	virtual double Interpret(Context context);
};

