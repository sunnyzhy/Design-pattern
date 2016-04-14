#pragma once
#include <vector>
#include "SafeComponent.h"

class SafeComposite : public SafeComponent
{
public:
	SafeComposite(string name, int depth, Type type);
	void Add(SafeComponent *component);
	void Remove(SafeComponent *component);
	SafeComponent *GetChild(int i);
	void Display(SafeComponent *component);

	friend bool operator==(const SafeComponent& a,const SafeComponent& b);

private:
	vector<SafeComponent*>::iterator itor;

protected:
	vector<SafeComponent*> children;
};

