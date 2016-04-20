#pragma once
#include "WebSite.h"

class Google : public WebSite
{
public:
	void Request(string url);
	string Response();
};

