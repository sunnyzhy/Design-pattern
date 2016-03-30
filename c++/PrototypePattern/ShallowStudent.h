#pragma once
#include "Student.h"

class ShallowStudent : public Student
{
public:
	ShallowStudent();
	ShallowStudent(const ShallowStudent &student);
	Student *Clone();
};

