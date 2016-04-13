#include "stdafx.h"
#include "Egg.h"


Egg::Egg(Food *food) : Ingredients(food)
{
	this->Name.append("¼¦µ°");
	this->Name.append(this->food->Name);
}


void Egg::Cook()
{
	cout<<this->Name<<endl;
}
