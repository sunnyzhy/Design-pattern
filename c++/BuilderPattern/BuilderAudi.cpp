#include "stdafx.h"
#include "BuilderAudi.h"

BuilderAudi::BuilderAudi()
{
	car = new Car();
}

void BuilderAudi::BuildBody()
{
	car->body = new Body();
	car->body->Description="�µϵĳ���ṹ.";
	cout<<"��װ"+car->body->Description<<endl;
}

void BuilderAudi::BuildEngine()
{
	car->engine = new Engine();
	car->engine->Description="�µϵķ�����.";
	cout<<"��װ"+car->engine->Description<<endl;
}

void BuilderAudi::BuildWheel()
{
	car->wheel = new Wheel();
	car->wheel->Description="�µϵĳ���.";
	cout<<"��װ"+car->wheel->Description<<endl;
}

Car *BuilderAudi::CreateCar()
{
	cout<<"�µϳ���װ���."<<endl;
	return car;
}