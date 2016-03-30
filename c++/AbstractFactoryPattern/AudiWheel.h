#pragma once
#include "IWheel.h"

class AudiWheel : public IWheel
{
public:
	void InstallLeftFrontWheel();
	void InstallRightFrontWheel();
	void InstallLeftBackWheel();
	void InstallRightBackWheel();
};

