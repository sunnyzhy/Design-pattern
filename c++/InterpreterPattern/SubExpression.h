#pragma once
#include "OperatorExpression.h"

class SubExpression : public OperatorExpression
{
public:
	SubExpression(Expression *left,Expression *right);
	double Interpret(Context context);
};

