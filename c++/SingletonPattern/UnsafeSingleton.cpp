#include "stdafx.h"
#include "UnsafeSingleton.h"

UnsafeSingleton *UnsafeSingleton::instance = NULL; //��̬��Ա��ʼ��

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
	cout<<"���̰߳�ȫ�ĵ���ģʽ."<<endl;
}

