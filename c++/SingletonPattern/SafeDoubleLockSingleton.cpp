#include "stdafx.h"
#include "SafeDoubleLockSingleton.h"

mutex m_mutex;
SafeDoubleLockSingleton *SafeDoubleLockSingleton::instance = NULL; //静态成员初始化

SafeDoubleLockSingleton::SafeDoubleLockSingleton()
{

}

SafeDoubleLockSingleton *SafeDoubleLockSingleton::GetInstance()
{
	if(instance==NULL)
	{
		m_mutex.lock();
		if(instance==NULL)
		{
			instance = new SafeDoubleLockSingleton();
		}
		m_mutex.unlock();
	}
	return instance;
}

void SafeDoubleLockSingleton::Print()
{
	cout<<"双重锁定,线程安全的单例模式."<<endl;
}