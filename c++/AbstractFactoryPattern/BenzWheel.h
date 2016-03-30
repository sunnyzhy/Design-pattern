#pragma once
#include "IWheel.h"

class BenzWheel : public IWheel
{
public:
	void InstallLeftFrontWheel();
	void InstallRightFrontWheel();
	void InstallLeftBackWheel();
	void InstallRightBackWheel();
};

