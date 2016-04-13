#include "stdafx.h"
#include "TransparentComposite.h"


TransparentComposite::TransparentComposite(string name, int depth, Type type) : TransparentComponent(name, depth, type)
{

}


void TransparentComposite::Add(TransparentComponent *component)
{
	this->children.push_back(component);
}

void TransparentComposite::Remove(TransparentComponent *component)
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
	this->children.pop_back();
}

TransparentComponent *TransparentComposite::GetChild(int i)
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

void TransparentComposite::Display(TransparentComponent *component)
{
	TransparentComposite *c =(TransparentComposite*)component;
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

bool operator==(const TransparentComponent& a,const TransparentComponent& b)
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