#pragma once
#include "OperatorExpression.h"

class MulExpression : public OperatorExpression
{
public:
	MulExpression(Expression *left,Expression *right);
	double Interpret(Context context);
};

