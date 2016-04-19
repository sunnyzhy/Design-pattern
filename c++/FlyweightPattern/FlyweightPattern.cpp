// FlyweightPattern.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "CourseFactory.h"

int _tmain(int argc, _TCHAR* argv[])
{
	CourseFactory factory;
	Student jim("Jim");
	Student tom("Tom");
	Course course1 = factory.GetCourse("Java", 20);
	course1.Print(jim);
	Course course2 = factory.GetCourse("C++", 30);
	course2.Print(jim);
	Course course3 = factory.GetCourse("C#", 10);
	course3.Print(jim);
	Course course4 = factory.GetCourse("Java", 20);
	course4.Print(tom);
	Course course5 = factory.GetCourse("C#", 10);
	course5.Print(tom);
	factory.GetCourseCount();

	system("pause");
	return 0;
}

