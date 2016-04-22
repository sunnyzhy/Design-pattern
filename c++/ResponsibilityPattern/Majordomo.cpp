#include "stdafx.h"
#include "Majordomo.h"


Majordomo::Majordomo(string name) : Handler(name)
{
	this->name = name;
}


void Majordomo::HandeRequest(Request request)
{
	if (request.days > 0 && request.days < 3)
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
