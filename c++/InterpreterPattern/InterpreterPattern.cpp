// InterpreterPattern.cpp : �������̨Ӧ�ó������ڵ㡣
//

#include "stdafx.h"
#include "Calculator.h"

int _tmain(int argc, _TCHAR* argv[])
{
	string expression;
	cin>>expression;
	Calculator calculator(expression);
	double value = calculator.Calculate();
	cout<<expression<<"="<<value<<endl;

	system("pause");
	return 0;
}

