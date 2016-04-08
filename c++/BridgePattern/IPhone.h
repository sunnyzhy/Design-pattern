#pragma once
#include "MobilePhone.h"

class IPhone : public MobilePhone
{
public:
	IPhone(MobilePhoneApp *app);
	void Run();
};

