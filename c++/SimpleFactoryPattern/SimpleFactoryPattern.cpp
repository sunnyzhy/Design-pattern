// SimpleFactoryPattern.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "CarFactory.h"

int _tmain(int argc, _TCHAR* argv[])
{
	CarFactory *factory = new CarFactory();
	factory->name = "Audi";
	ICar *car =	NULL;
	car = factory->CreateCar();
	car->Print();

	delete car;
	car = NULL;
	delete factory;
	factory = NULL;
	system("pause");
	return 0;
}

