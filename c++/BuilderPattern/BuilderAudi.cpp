#include "stdafx.h"
#include "BuilderAudi.h"

BuilderAudi::BuilderAudi()
{
	car = new Car();
}

void BuilderAudi::BuildBody()
{
	car->body = new Body();
	car->body->Description="奥迪的车身结构.";
	cout<<"安装"+car->body->Description<<endl;
}

void BuilderAudi::BuildEngine()
{
	car->engine = new Engine();
	car->engine->Description="奥迪的发动机.";
	cout<<"安装"+car->engine->Description<<endl;
}

void BuilderAudi::BuildWheel()
{
	car->wheel = new Wheel();
	car->wheel->Description="奥迪的车轮.";
	cout<<"安装"+car->wheel->Description<<endl;
}

Car *BuilderAudi::CreateCar()
{
	cout<<"奥迪车安装完成."<<endl;
	return car;
}