#pragma once
#include "MobilePhoneApp.h"

class MobilePhone
{
public:
	MobilePhone(MobilePhoneApp *app);
	virtual void Run()=0;

protected:
	MobilePhoneApp *app;
};

