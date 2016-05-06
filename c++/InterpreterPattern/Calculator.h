#pragma once
#include <iostream>
#include <string>
#include <stack> 
#include "Context.h"
#include "Expression.h"
#include "VariableExpression.h"
#include "AddExpression.h"
#include "SubExpression.h"
#include "MulExpression.h"
#include "DivExpression.h"
using namespace std;

class Calculator
{
public:
	Calculator(string expression);
	double Calculate();
private:
	string expression;
	Context context;
};

