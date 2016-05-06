#pragma once
#include"Command.h"
#include "Chef.h"

class CookFishCommand : public Command
{
public:
	CookFishCommand(Chef chef);
	void Cook();
private:
	Chef chef;
};

