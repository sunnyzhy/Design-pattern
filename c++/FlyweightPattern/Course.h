#pragma once
#include "AbstractCourse.h"

class Course : public AbstractCourse
{
public:
	string name;
	int periods;
	Course(string name, int periods);
	void Print(Student student);
};

