#include "stdafx.h"
#include "AudiFactory.h"
#include "Audi.h"

ICar *AudiFactory::CreateCar()
{
	return new Audi();
}

