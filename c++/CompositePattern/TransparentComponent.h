#pragma once
#include <iostream>
#include <string>
#include "Type.h"
using namespace std;

class TransparentComponent
{
public:
	string name;
	int depth;
	Type type;

	TransparentComponent(string name, int depth, Type type);
	virtual void Add(TransparentComponent *component);
	virtual void Remove(TransparentComponent *component);
	virtual TransparentComponent *GetChild(int i);
	virtual void Display(TransparentComponent *component);
};

