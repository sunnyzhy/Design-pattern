#pragma once
#include"Command.h"
#include "Chef.h"

class CookBeefCommand : public Command
{
public:
	CookBeefCommand(Chef chef);
	void Cook();
private:
	Chef chef;
};

