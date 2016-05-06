#include "stdafx.h"
#include "CookBeefCommand.h"


CookBeefCommand::CookBeefCommand(Chef chef)
{
	this->chef = chef;
	Command::Name = "±¬³´Å£Èâ";
}


void CookBeefCommand::Cook()
{
	this->chef.CookBeef();
}
