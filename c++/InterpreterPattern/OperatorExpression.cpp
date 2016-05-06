#include "stdafx.h"
#include "OperatorExpression.h"


OperatorExpression::OperatorExpression(Expression *left,Expression *right)
{
	this->left = left;
	this->right = right;
}
