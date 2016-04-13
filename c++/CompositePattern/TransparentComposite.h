#pragma once
#include <vector>
#include "TransparentComponent.h"

class TransparentComposite : public TransparentComponent
{
public:
	TransparentComposite(string name, int depth, Type type);
	void Add(TransparentComponent *component);
	void Remove(TransparentComponent *component);
	TransparentComponent *GetChild(int i);
	void Display(TransparentComponent *component);

	friend bool operator==(const TransparentComponent& a,const TransparentComponent& b);

private:
	vector<TransparentComponent*>::iterator itor;

protected:
	vector<TransparentComponent*> children;
};

