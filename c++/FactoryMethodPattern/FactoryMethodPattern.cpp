// FactoryMethodPattern.cpp : �������̨Ӧ�ó������ڵ㡣
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
	delete factory;

	system("pause");
	return 0;
}

