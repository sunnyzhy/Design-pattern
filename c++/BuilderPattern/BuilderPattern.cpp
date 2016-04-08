// BuilderPattern.cpp : �������̨Ӧ�ó������ڵ㡣
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
	delete car->engine;
	delete car->wheel;
	delete car;
	delete builder;
	delete director;

	system("pause");
	return 0;
}

