// SimpleFactoryPattern.cpp : �������̨Ӧ�ó������ڵ㡣
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
	delete factory;

	system("pause");
	return 0;
}

