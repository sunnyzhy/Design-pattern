#pragma once
#include "Expression.h"

class OperatorExpression : public Expression
{
public:
	OperatorExpression(Expression *left,Expression *right);

protected:
	Expression *left;
	Expression *right;
};

