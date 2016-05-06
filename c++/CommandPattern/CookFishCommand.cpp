#include "stdafx.h"
#include "CookFishCommand.h"


CookFishCommand::CookFishCommand(Chef chef)
{
	this->chef = chef;
	Command::Name = "Ë®ÖóÓã";
}



void CookFishCommand::Cook()
{
	this->chef.CookFish();
}
