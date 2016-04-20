#include "stdafx.h"
#include "Proxy.h"


Proxy::Proxy(Google google)
{
	this->google = google;
}

void Proxy::Request(string url)
{
	this->google.Request(url);
}


string Proxy::Response()
{
	return this->google.Response();
}
