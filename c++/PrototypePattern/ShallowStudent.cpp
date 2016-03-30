#include "stdafx.h"
#include "ShallowStudent.h"

ShallowStudent::ShallowStudent()
{

}

ShallowStudent::ShallowStudent(const ShallowStudent &student)
{
	this->name = student.name;
	this->age = student.age;
	this->course = student.course;
}

Student *ShallowStudent::Clone()
{
	return new ShallowStudent(*this);
}

