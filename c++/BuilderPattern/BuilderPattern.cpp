// BuilderPattern.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "Director.h"
#include "BuilderAudi.h"

int _tmain(int argc, _TCHAR* argv[])
{
	Director *director = new Director();
	IBuilder *builder = new BuilderAudi();
	director->Constrcut(builder);
	Car *car = builder->CreateCar();

	delete car->body;
	car->body = NULL;
	delete car->engine;
	car->engine = NULL;
	delete car->wheel;
	car->wheel = NULL;
	delete car;
	car = NULL;
	delete builder;
	builder = NULL;
	delete director;
	director = NULL;
	system("pause");
	return 0;
}

