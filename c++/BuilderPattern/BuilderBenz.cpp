#include "stdafx.h"
#include "BuilderBenz.h"

BuilderBenz::BuilderBenz()
{
	car = new Car();
}

void BuilderBenz::BuildBody()
{
	car->body = new Body();
	car->body->Description="���۵ĳ���ṹ.";
	cout<<"��װ"+car->body->Description<<endl;
}

void BuilderBenz::BuildEngine()
{
	car->engine = new Engine();
	car->engine->Description="���۵ķ�����.";
	cout<<"��װ"+car->engine->Description<<endl;
}

void BuilderBenz::BuildWheel()
{
	car->wheel = new Wheel();
	car->wheel->Description="���۵ĳ���.";
	cout<<"��װ"+car->wheel->Description<<endl;
}

Car *BuilderBenz::CreateCar()
{
	cout<<"���۳���װ���."<<endl;
	return car;
}
