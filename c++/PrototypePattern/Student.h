#pragma once
#include <iostream>
#include "Course.h"
using namespace std;

class Student
{
public:
	string name;
	int age;
	Course *course;

	virtual Student *Clone()=0;
};

