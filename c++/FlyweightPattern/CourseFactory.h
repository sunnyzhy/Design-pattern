#pragma once
#include <map>  
#include "Course.h"
using namespace std;

class CourseFactory
{
public:
	Course GetCourse(string name, int periods);
	int GetCourseCount();
private:
	map<string,Course> courses;
};

