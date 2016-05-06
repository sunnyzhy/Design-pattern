#pragma once
#include "OperatorExpression.h"

class AddExpression : public OperatorExpression
{
public:
	AddExpression(Expression *left,Expression *right);
	double Interpret(Context context);
};

