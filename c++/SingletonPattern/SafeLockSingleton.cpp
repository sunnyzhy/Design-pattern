#include "stdafx.h"
#include "SafeLockSingleton.h"

mutex m_mutex1;
SafeLockSingleton *SafeLockSingleton::instance = NULL; //静态成员初始化

SafeLockSingleton::SafeLockSingleton()
{

}

SafeLockSingleton *SafeLockSingleton::GetInstance()
{
	m_mutex1.lock();
	if(instance==NULL)
	{
		instance = new SafeLockSingleton();
	}
	m_mutex1.unlock();
	return instance;
}

void SafeLockSingleton::Print()
{
	cout<<"线程安全的单例模式."<<endl;
}