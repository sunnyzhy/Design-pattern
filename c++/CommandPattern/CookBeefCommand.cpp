#include "stdafx.h"
#include "CookBeefCommand.h"


CookBeefCommand::CookBeefCommand(Chef chef)
{
	this->chef = chef;
	Command::Name = "����ţ��";
}


void CookBeefCommand::Cook()
{
	this->chef.CookBeef();
}
