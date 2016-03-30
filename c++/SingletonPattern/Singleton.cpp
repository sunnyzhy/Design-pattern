#include "stdafx.h"
#include "Singleton.h"


const Singleton *Singleton::instance = new Singleton(); //��̬��Ա��ʼ��

Singleton::Singleton()
{

}

const Singleton *Singleton::GetInstance()
{
	if(instance==NULL)
	{
		instance = new Singleton();
	}
	return instance;
}

void Singleton::Print() const
{
	cout<<"��̬��ʼ�����̰߳�ȫ�ĵ���ģʽ."<<endl;
}