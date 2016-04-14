#include "stdafx.h"
#include "SafeComponent.h"


SafeComponent::SafeComponent(string name, int depth, Type type)
{
	this->name = name;
	this->depth = depth;
	this->type = type;
}

void SafeComponent::Display(SafeComponent *component)
{

}
