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
		cout<< this->name << "��׼��" << request.name + "��" << request.days << "�����." << endl;
	}
	else
	{
		if (this->superior != NULL)
		{
			this->superior->HandeRequest(request);
		}
	}
}
