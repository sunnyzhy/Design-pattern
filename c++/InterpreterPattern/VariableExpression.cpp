#include "stdafx.h"
#include "VariableExpression.h"


VariableExpression::VariableExpression(char key)
{
	this->key = key;
}


double VariableExpression::Interpret(Context context)
{
	return context.Variable[this->key];
}
