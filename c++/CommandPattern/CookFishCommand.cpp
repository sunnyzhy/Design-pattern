#include "stdafx.h"
#include "CookFishCommand.h"


CookFishCommand::CookFishCommand(Chef chef)
{
	this->chef = chef;
	Command::Name = "ˮ����";
}



void CookFishCommand::Cook()
{
	this->chef.CookFish();
}
