#pragma once
#include "WebSite.h"
#include "Google.h"

class Proxy : public WebSite
{
public:
	Proxy(Google google);
	void Request(string url);
	string Response();
private:
	Google google;
};

