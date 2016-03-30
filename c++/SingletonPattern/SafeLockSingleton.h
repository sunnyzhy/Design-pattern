#pragma once
#include <iostream>
#include <mutex>
using namespace std;

class SafeLockSingleton
{
public:
	static SafeLockSingleton *GetInstance();
	void Print();

private:
	SafeLockSingleton();
	static SafeLockSingleton *instance;
};

