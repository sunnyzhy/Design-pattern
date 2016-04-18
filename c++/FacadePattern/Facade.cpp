#include "stdafx.h"
#include "Facade.h"


Facade::Facade()
{
	
}


void Facade::Cook()
{
	this->tomato.Cook();
    this->water.Boil();
    this->noodles.Cook();
    this->egg.Cook();
    this->pepper.Put();
}
