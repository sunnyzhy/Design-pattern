#pragma once
#include <iostream>
using namespace std;

class UnsafeSingleton
{
public:
	static UnsafeSingleton *GetInstance();
	void Print();

private:
	UnsafeSingleton();
	static UnsafeSingleton *instance;
};

