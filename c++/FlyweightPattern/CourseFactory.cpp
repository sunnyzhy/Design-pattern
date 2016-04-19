#include "stdafx.h"
#include "CourseFactory.h"


Course CourseFactory::GetCourse(string name, int periods)
{
	map<string,Course>::iterator itr;
	itr = this->courses.find(name);
	if(itr==this->courses.end())
	{
		this->courses.insert(map<string,Course>::value_type(name,Course(name,periods)));
	}
	itr = this->courses.find(name);
	return itr->second;
}


int CourseFactory::GetCourseCount()
{
	cout<<"¿ª¿Î×ÜÊý£º" << this->courses.size() <<endl;
	return this->courses.size();
}
