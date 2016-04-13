#include "stdafx.h"
#include "Tomato.h"


Tomato::Tomato(Food *food) : Ingredients(food)
{
	this->Name.append("Î÷ºìÊÁ");
	this->Name.append(this->food->Name);
}


void Tomato::Cook()
{
	cout<<this->Name<<endl;
}
