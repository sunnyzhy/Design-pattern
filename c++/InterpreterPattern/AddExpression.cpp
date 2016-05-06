#include "stdafx.h"
#include "AddExpression.h"


AddExpression::AddExpression(Expression *left,Expression *right) : OperatorExpression(left,right)
{

}


double AddExpression::Interpret(Context context)
{
	return this->left->Interpret(context) + this->right->Interpret(context);
}
