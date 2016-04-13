#include "stdafx.h"
#include "TransparentLeaf.h"


TransparentLeaf::TransparentLeaf(string name, int depth, Type type) : TransparentComponent(name, depth, type)
{

}


void TransparentLeaf::Add(TransparentComponent *component)
{
	
}

void TransparentLeaf::Remove(TransparentComponent *component)
{
	
}

TransparentComponent *TransparentLeaf::GetChild(int i)
{
	return NULL;
}

void TransparentLeaf::Display(TransparentComponent *component)
{
	for(int n=0;n<component->depth;n++)
	{
		cout<<"-";
	}
	cout<<component->name<<endl;
}