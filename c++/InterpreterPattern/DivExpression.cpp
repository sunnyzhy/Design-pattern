#include "stdafx.h"
#include "DivExpression.h"


DivExpression::DivExpression(Expression *left,Expression *right) : OperatorExpression(left,right)
{

}


double DivExpression::Interpret(Context context)
{
	return this->left->Interpret(context) / this->right->Interpret(context);
}
