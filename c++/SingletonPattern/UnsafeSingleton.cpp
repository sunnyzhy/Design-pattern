#include "stdafx.h"
#include "UnsafeSingleton.h"

UnsafeSingleton *UnsafeSingleton::instance = NULL; //静态成员初始化

UnsafeSingleton::UnsafeSingleton()
{

}

UnsafeSingleton *UnsafeSingleton::GetInstance()
{
	if(instance==NULL)
	{
		instance = new UnsafeSingleton();
	}
	return instance;
}

void UnsafeSingleton::Print()
{
	cout<<"非线程安全的单例模式."<<endl;
}

