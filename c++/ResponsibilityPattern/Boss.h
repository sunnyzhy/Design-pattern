#pragma once
#include "Handler.h"

class Boss : public Handler
{
public:
	Boss(string name);
	void HandeRequest(Request request);
};

