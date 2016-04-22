#include "stdafx.h"
#include "Handler.h"


Handler::Handler(string name)
{
	this->name = name;
}


void Handler::SetSuperior(Handler *superior)
{
	this->superior = superior;
}

void Handler::HandeRequest(Request request)
{

}
