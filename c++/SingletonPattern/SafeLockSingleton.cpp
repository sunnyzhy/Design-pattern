#include "stdafx.h"
#include "SafeLockSingleton.h"

mutex m_mutex1;
SafeLockSingleton *SafeLockSingleton::instance = NULL; //��̬��Ա��ʼ��

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
	cout<<"�̰߳�ȫ�ĵ���ģʽ."<<endl;
}