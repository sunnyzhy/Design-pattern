#include "stdafx.h"
#include "SubExpression.h"


SubExpression::SubExpression(Expression *left,Expression *right) : OperatorExpression(left,right)
{

}


double SubExpression::Interpret(Context context)
{
	return this->left->Interpret(context) - this->right->Interpret(context);
}
