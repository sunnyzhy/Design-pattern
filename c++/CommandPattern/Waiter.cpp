#include "stdafx.h"
#include "Waiter.h"



void Waiter::SetOrder(Command *command)
{
	this->commands.push_back(command);
	cout<<"���Ӷ�����" << command->Name<<endl;
}

void Waiter::CancelOrder(Command *command)
{
	for(vector<Command*>::iterator itor = this->commands.begin(); itor != this->commands.end(); itor++)
	{
		if((*itor)->Name.compare(command->Name) == 0)
		{
			itor = this->commands.erase(itor);
			cout<<"ȡ��������" << command->Name<<endl;
		}
		if(itor == this->commands.end())
		{
			break;
		}
	}
}

void Waiter::Notify()
{
	for(vector<Command*>::iterator itor = this->commands.begin(); itor != this->commands.end(); itor++)
	{
		(*itor)->Cook();
	}
}
