#include "stdafx.h"
#include "Manager.h"


Manager::Manager(string name) : Handler(name)
{
	this->name = name;
}


void Manager::HandeRequest(Request request)
{
	if (request.days > 0 && request.days < 2)
	{
		cout<< this->name << "批准了" << request.name + "的" << request.days << "天假期." << endl;
	}
	else
	{
		if (this->superior != NULL)
		{
			this->superior->HandeRequest(request);
		}
	}
}
