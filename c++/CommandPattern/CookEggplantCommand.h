#pragma once
#include"Command.h"
#include "Chef.h"

class CookEggplantCommand : public Command
{
public:
	CookEggplantCommand(Chef chef);
	void Cook();
private:
	Chef chef;
};

