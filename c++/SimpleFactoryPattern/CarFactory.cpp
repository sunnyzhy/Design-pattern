#include "stdafx.h"
#include "CarFactory.h"

ICar *CarFactory::CreateCar()
{
	transform(name.begin(), name.end(), name.begin(), ::tolower);  
	if(strcmp(name.c_str(),"audi")==0)
	{
		return new Audi();
	}
	else if(strcmp(name.c_str(),"benz")==0)
	{
		return new Benz();
	}
	return NULL;
}
