// PrototypePattern.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "ShallowStudent.h"

int _tmain(int argc, _TCHAR* argv[])
{
	Student *student = new ShallowStudent();
	student->name = "Jim";
	student->age = 20;
	student->course = new Course();
	student->course->name = "C++";
	cout<<"student :" << student->name.c_str() << "\t" << student->age << "\t" << student->course->name.c_str() << endl;

	cout<<endl;
	Student *student1 = student->Clone();
	student1->name = "Tom";
	student1->age = 21;
	student1->course->name = "C#";
	cout<<"student :" << student->name.c_str() << "\t" << student->age << "\t" << student->course->name.c_str() << endl;
	cout<<"student1:" << student1->name.c_str() << "\t" << student1->age << "\t" << student1->course->name.c_str() << endl;

	cout<<endl;
	student1->course->name = "Java";
	cout<<"student :" << student->name.c_str() << "\t" << student->age << "\t" << student->course->name.c_str() << endl;
	cout<<"student1:" << student1->name.c_str() << "\t" << student1->age << "\t" << student1->course->name.c_str() << endl;

	delete student1->course;
	student1->course = NULL;
	delete student1;
	student1 = NULL;
	delete student;
	student = NULL;

	system("pause");
	return 0;
}

