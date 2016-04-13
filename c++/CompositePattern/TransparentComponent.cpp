#include "stdafx.h"
#include "TransparentComponent.h"


TransparentComponent::TransparentComponent(string name, int depth, Type type)
{
	this->name = name;
	this->depth = depth;
	this->type = type;
}

void TransparentComponent::Add(TransparentComponent *component)
{

}

void TransparentComponent::Remove(TransparentComponent *component)
{

}

TransparentComponent *TransparentComponent::GetChild(int i)
{
	return NULL;
}

void TransparentComponent::Display(TransparentComponent *component)
{

}