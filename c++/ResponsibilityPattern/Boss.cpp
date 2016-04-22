#include "stdafx.h"
#include "Boss.h"


Boss::Boss(string name) : Handler(name)
{
	this->name = name;
}


void Boss::HandeRequest(Request request)
{
	cout<< this->name << "批准了" << request.name + "的" << request.days << "天假期." << endl;
}
