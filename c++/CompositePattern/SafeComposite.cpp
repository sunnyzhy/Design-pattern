#include "stdafx.h"
#include "SafeComposite.h"


SafeComposite::SafeComposite(string name, int depth, Type type) : SafeComponent(name, depth, type)
{

}


void SafeComposite::Add(SafeComponent *component)
{
	this->children.push_back(component);
}

void SafeComposite::Remove(SafeComponent *component)
{
	for(itor = this->children.begin(); itor != this->children.end(); itor++)
	{
		if(*itor == component)
		{
			itor = this->children.erase(itor);
		}
		if(itor == this->children.end())
		{
			break;
		}
	}
}

SafeComponent *SafeComposite::GetChild(int i)
{
	if(i>=0 && i<this->children.size())
	{
		return this->children.at(i);
	}
	else
	{
		return NULL;
	}
}

void SafeComposite::Display(SafeComponent *component)
{
	SafeComposite *c =(SafeComposite*)component;
	for(int i=0;i<c->children.size();i++)
	{
		if(c->children[i]->type == Composite)
		{
			for(int n=0;n<c->children[i]->depth;n++)
			{
				cout<<"-";
			}
			cout<<c->children[i]->name<<endl;
			Display(c->children[i]);
		}
		else
		{
			c->children[i]->Display(c->children[i]);
		}
	}
}

bool operator==(const SafeComponent& a,const SafeComponent& b)
{
	if(a.name.compare(b.name) && a.depth == b.depth)
	{
		return true;
	}
	else
	{
		return false;
	}
}
