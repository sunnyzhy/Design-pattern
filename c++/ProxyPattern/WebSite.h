#pragma once
#include <iostream>
#include <string>
using namespace std;

class WebSite
{
public:
	virtual void Request(string url)=0;
	virtual string Response()=0;
};

