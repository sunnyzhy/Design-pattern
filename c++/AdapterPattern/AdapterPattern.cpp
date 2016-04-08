// AdapterPattern.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include <iostream>
#include "ICalculation.h"
#include "Calculation.h"
#include "CalculationClassAdapter.h"
#include "CalculationObjectAdapter.h"
using namespace std;

int _tmain(int argc, _TCHAR* argv[])
{
	ICalculation *calculation = new Calculation();
	cout<<calculation->Add(1.1,2.2)<<endl;

	delete calculation;

	calculation = new CalculationObjectAdapter(new CalculationAdaptee());
	cout<<calculation->Add(1.1,2.2)<<endl;

	delete calculation;

	system("pause");
	return 0;
}

