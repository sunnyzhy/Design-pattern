#include <iostream>
#include <mutex>
using namespace std;

class SafeDoubleLockSingleton
{
public:
	static SafeDoubleLockSingleton *GetInstance();
	void Print();

private:
	SafeDoubleLockSingleton();
	static SafeDoubleLockSingleton *instance;
	
};

