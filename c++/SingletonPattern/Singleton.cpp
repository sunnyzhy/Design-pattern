#include "stdafx.h"
#include "Singleton.h"


const Singleton *Singleton::instance = new Singleton(); //静态成员初始化

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
	cout<<"静态初始化，线程安全的单例模式."<<endl;
}