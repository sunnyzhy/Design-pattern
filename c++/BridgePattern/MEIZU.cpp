#include "stdafx.h"
#include "MEIZU.h"


MEIZU::MEIZU(MobilePhoneApp *app):MobilePhone(app)
{

}


void MEIZU::Run()
{
	this->app->Run();
}
