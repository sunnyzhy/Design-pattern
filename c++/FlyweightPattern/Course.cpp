#include "stdafx.h"
#include "Course.h"


Course::Course(string name, int periods)
{
	this->name = name;
	this->periods = periods;
}


void Course::Print(Student student)
{
	cout<<student.name << ":\t" << this->name << "(" << this->periods << "¿ÎÊ±)"<<endl;;
}
