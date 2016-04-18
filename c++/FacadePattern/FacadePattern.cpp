// FacadePattern.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "Facade.h"

int _tmain(int argc, _TCHAR* argv[])
{
	Facade facade;
	facade.Cook();

	system("pause");
	return 0;
}

