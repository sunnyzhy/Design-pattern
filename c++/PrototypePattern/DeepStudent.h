#pragma once
#include "Student.h"

class DeepStudent : public Student
{
public:
	DeepStudent();
	DeepStudent(const DeepStudent &student);
	Student *Clone();
};

