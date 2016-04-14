#pragma once
#include "SafeComponent.h"

class SafeLeaf : public SafeComponent
{
public:
	SafeLeaf(string name, int depth, Type type);
	void Display(SafeComponent *component);
};

