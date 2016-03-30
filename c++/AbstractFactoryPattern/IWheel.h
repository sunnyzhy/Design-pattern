#pragma once
#include <iostream>
using namespace std;

class IWheel
{
public:
	virtual void InstallLeftFrontWheel()=0;
	virtual void InstallRightFrontWheel()=0;
	virtual void InstallLeftBackWheel()=0;
	virtual void InstallRightBackWheel()=0;
};

