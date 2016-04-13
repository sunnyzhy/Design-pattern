// DecoratorPattern.cpp : �������̨Ӧ�ó������ڵ㡣
//

#include "stdafx.h"
#include "Food.h"
#include "Noodles.h"
#include "Tomato.h"
#include "Egg.h"

int _tmain(int argc, _TCHAR* argv[])
{
	Food *noodles = new Noodles();
	Egg *egg = new Egg(noodles);
	Tomato *tomato = new Tomato(egg);
	tomato->Cook();

	delete tomato;
	delete egg;
	delete noodles;

	system("pause");
	return 0;
}

