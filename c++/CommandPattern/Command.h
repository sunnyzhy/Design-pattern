#pragma once
#include <iostream>
#include <string>
using namespace std;

class Command
{
public:
	string Name;
    virtual void Cook();
};

