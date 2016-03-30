// SingletonPattern.cpp : �������̨Ӧ�ó������ڵ㡣
//

#include "stdafx.h"
#include <iostream>
#include "Singleton.h"

int _tmain(int argc, _TCHAR* argv[])
{
	const Singleton *instance = Singleton::GetInstance();
	instance->Print();

	delete instance;
	instance = NULL;

	system("pause");
	return 0;
}

