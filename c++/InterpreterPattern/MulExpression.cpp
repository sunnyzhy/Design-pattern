#include "stdafx.h"
#include "MulExpression.h"


MulExpression::MulExpression(Expression *left,Expression *right) : OperatorExpression(left,right)
{

}


double MulExpression::Interpret(Context context)
{
	return this->left->Interpret(context) * this->right->Interpret(context);
}