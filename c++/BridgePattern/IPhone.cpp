#include "stdafx.h"
#include "IPhone.h"


IPhone::IPhone(MobilePhoneApp *app):MobilePhone(app)
{

}


void IPhone::Run()
{
	this->app->Run();
}
