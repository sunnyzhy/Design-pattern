#pragma once
#include "Handler.h"

class Majordomo : public Handler
{
public:
	Majordomo(string name);
	void HandeRequest(Request request);
};

