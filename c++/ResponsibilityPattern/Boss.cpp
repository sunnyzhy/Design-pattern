#include "stdafx.h"
#include "Boss.h"


Boss::Boss(string name) : Handler(name)
{
	this->name = name;
}


void Boss::HandeRequest(Request request)
{
	cout<< this->name << "��׼��" << request.name + "��" << request.days << "�����." << endl;
}
