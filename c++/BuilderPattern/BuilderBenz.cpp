#include "stdafx.h"
#include "BuilderBenz.h"

BuilderBenz::BuilderBenz()
{
	car = new Car();
}

void BuilderBenz::BuildBody()
{
	car->body = new Body();
	car->body->Description="奔驰的车身结构.";
	cout<<"安装"+car->body->Description<<endl;
}

void BuilderBenz::BuildEngine()
{
	car->engine = new Engine();
	car->engine->Description="奔驰的发动机.";
	cout<<"安装"+car->engine->Description<<endl;
}

void BuilderBenz::BuildWheel()
{
	car->wheel = new Wheel();
	car->wheel->Description="奔驰的车轮.";
	cout<<"安装"+car->wheel->Description<<endl;
}

Car *BuilderBenz::CreateCar()
{
	cout<<"奔驰车安装完成."<<endl;
	return car;
}
