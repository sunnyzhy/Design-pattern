#pragma once
#include "Expression.h"

class VariableExpression : public Expression
{
public:
	VariableExpression(char key);
	double Interpret(Context context);
private:
	char key;
};

