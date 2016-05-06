// CommandPattern.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "CookBeefCommand.h"
#include "CookEggplantCommand.h"
#include "CookFishCommand.h"
#include "Chef.h"
#include "Waiter.h"

int _tmain(int argc, _TCHAR* argv[])
{
	Chef chef;
	Command *cookBeef = new CookBeefCommand(chef);
	Command *cookEggplant = new CookEggplantCommand(chef);
	Command *cookFish = new CookFishCommand(chef);

	Waiter waiter;
	waiter.SetOrder(cookBeef);
	waiter.SetOrder(cookEggplant);
	waiter.SetOrder(cookFish);
	waiter.CancelOrder(cookFish);
	waiter.Notify();

	system("pause");
	return 0;
}

