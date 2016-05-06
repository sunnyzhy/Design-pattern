#pragma once
#include <iostream>
#include <vector>
#include "Command.h"
using namespace std;

class Waiter
{
public:
	void SetOrder(Command *command);
	void CancelOrder(Command *command);
	void Notify();
private:
	vector<Command*> commands;
};

