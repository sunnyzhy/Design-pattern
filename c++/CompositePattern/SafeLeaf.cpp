#include "stdafx.h"
#include "SafeLeaf.h"


SafeLeaf::SafeLeaf(string name, int depth, Type type) : SafeComponent(name, depth, type)
{

}

void SafeLeaf::Display(SafeComponent *component)
{
	for(int n=0;n<component->depth;n++)
	{
		cout<<"-";
	}
	cout<<component->name<<endl;
}
