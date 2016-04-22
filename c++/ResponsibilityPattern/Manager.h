#pragma once
#include "Handler.h"

class Manager : public Handler
{
public:
	Manager(string name);
	void HandeRequest(Request request);
};

