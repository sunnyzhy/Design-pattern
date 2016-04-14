#pragma once
#include <iostream>
#include <string>
#include "Type.h"
using namespace std;

class SafeComponent
{
public:
	string name;
	int depth;
	Type type;

	SafeComponent(string name, int depth, Type type);
	virtual void Display(SafeComponent *component);
};

