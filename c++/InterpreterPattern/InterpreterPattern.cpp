// InterpreterPattern.cpp : 定义控制台应用程序的入口点。
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

