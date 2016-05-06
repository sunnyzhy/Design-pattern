#include "stdafx.h"
#include "CookEggplantCommand.h"


CookEggplantCommand::CookEggplantCommand(Chef chef)
{
	this->chef = chef;
	Command::Name = "ºìÉÕÇÑ×Ó";
}



void CookEggplantCommand::Cook()
{
	this->chef.CookEggplant();
}

