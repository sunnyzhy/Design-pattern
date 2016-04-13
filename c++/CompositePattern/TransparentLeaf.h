#pragma once
#include "TransparentComponent.h"

class TransparentLeaf : public TransparentComponent
{
public:
	TransparentLeaf(string name, int depth, Type type);
	void Add(TransparentComponent *component);
	void Remove(TransparentComponent *component);
	TransparentComponent *GetChild(int i);
	void Display(TransparentComponent *component);
};

