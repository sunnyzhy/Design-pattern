// BridgePattern.cpp : �������̨Ӧ�ó������ڵ㡣
//

#include "stdafx.h"
#include "MEIZU.h"
#include "Music.h"

int _tmain(int argc, _TCHAR* argv[])
{
	MobilePhoneApp *app = new Music();
	MobilePhone *phone = new MEIZU(app);
	phone->Run();

	delete phone;
	delete app;

	system("pause");
	return 0;
}

