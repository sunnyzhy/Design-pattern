#pragma once
#include "OperatorExpression.h"

class DivExpression : public OperatorExpression
{
public:
	DivExpression(Expression *left,Expression *right);
	double Interpret(Context context);
};

