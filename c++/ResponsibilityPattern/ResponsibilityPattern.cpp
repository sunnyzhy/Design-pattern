// ResponsibilityPattern.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "Manager.h"
#include "Majordomo.h"
#include "Boss.h"
#include "Request.h"

int _tmain(int argc, _TCHAR* argv[])
{
	Manager manager("Manager");
	Majordomo majordomo("Majordomo");
	Boss boss("Boss");

	manager.SetSuperior(&majordomo);
	majordomo.SetSuperior(&boss);

	Request request1;
	request1.name = "Jim";
	request1.days = 1.5;
	manager.HandeRequest(request1);

	Request request2;
	request2.name = "Tom";
	request2.days = 2;
	manager.HandeRequest(request2);

	Request request3;
	request3.name = "Sam";
	request3.days = 5;
	manager.HandeRequest(request3);

	system("pause");
	return 0;
}

