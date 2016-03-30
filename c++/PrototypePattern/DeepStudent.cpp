#include "stdafx.h"
#include "DeepStudent.h"

DeepStudent::DeepStudent()
{

}

DeepStudent::DeepStudent(const DeepStudent &student)
{
	this->name = student.name;
	this->age = student.age;
	this->course = new Course();
	this->course->name = student.course->name;
}

Student *DeepStudent::Clone()
{
	return new DeepStudent(*this);
}