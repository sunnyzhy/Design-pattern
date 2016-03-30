// AbstractFactoryPattern.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "ICarFactory.h"
#include "AudiFactory.h"

int _tmain(int argc, _TCHAR* argv[])
{
	ICarFactory *factory = new AudiFactory();
	IBody *body = factory->CreateBody();
	body->Install();
	IEngine *engine = factory->CreateEngine();
	engine->Install();
	IWheel *wheel = factory->CreateWheel();
	wheel->InstallLeftFrontWheel();
	wheel->InstallRightFrontWheel();
	wheel->InstallLeftBackWheel();
	wheel->InstallRightBackWheel();

	delete wheel;
	wheel = NULL;
	delete engine;
	engine = NULL;
	delete body;
	body = NULL;
	delete factory;
	factory = NULL;
	system("pause");
	return 0;
}

