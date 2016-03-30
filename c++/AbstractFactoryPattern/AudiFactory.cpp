#include "stdafx.h"
#include "AudiFactory.h"

IEngine *AudiFactory::CreateEngine()
{
	return new AudiEngine();
}

IBody *AudiFactory::CreateBody()
{
	return new AudiBody();
}

IWheel *AudiFactory::CreateWheel()
{
	return new AudiWheel();
}
