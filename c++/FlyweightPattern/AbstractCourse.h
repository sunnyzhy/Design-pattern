#pragma once
#include "Student.h"

class AbstractCourse
{
public:
	virtual void Print(Student student)=0;
};

