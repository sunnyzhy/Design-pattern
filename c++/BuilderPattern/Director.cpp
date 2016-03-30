#include "stdafx.h"
#include "Director.h"

void Director::Constrcut(IBuilder *builder)
{
	builder->BuildBody();
	builder->BuildEngine();
	builder->BuildWheel();
}
