// FactoryMethodPattern.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "ICarFactory.h"
#include "AudiFactory.h"

int _tmain(int argc, _TCHAR* argv[])
{
	ICarFactory *factory = new AudiFactory();
	ICar *car = factory->CreateCar();
	car->Print();

	delete car;
	car = NULL;
	delete factory;
	factory = NULL;
	system("pause");
	return 0;
}

