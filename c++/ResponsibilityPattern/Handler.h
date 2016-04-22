#pragma once
#include "Request.h"

class Handler
{
public:
	string name;
	Handler(string name);
	void SetSuperior(Handler *superior);
	virtual void HandeRequest(Request request);

protected:
	Handler *superior;
};

