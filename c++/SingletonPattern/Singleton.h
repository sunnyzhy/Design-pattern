#pragma once
#include <iostream>
using namespace std;

class Singleton
{
public:
	static const Singleton *GetInstance();
	void Print() const;

private:
	Singleton();
	static const Singleton *instance;
};

