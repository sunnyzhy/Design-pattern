#include "stdafx.h"
#include "BenzFactory.h"
#include "Benz.h"

ICar *BenzFactory::CreateCar()
{
	return new Benz();
}

