#include "stdafx.h"
#include "SafeDoubleLockSingleton.h"

mutex m_mutex;
SafeDoubleLockSingleton *SafeDoubleLockSingleton::instance = NULL; //��̬��Ա��ʼ��

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
	cout<<"˫������,�̰߳�ȫ�ĵ���ģʽ."<<endl;
}