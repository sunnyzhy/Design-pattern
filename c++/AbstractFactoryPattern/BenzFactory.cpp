#include "stdafx.h"
#include "BenzFactory.h"

IEngine *BenzFactory::CreateEngine()
{
	return new BenzEngine();
}

IBody *BenzFactory::CreateBody()
{
	return new BenzBody();
}

IWheel *BenzFactory::CreateWheel()
{
	return new BenzWheel();
}