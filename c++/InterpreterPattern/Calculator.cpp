#include "stdafx.h"
#include "Calculator.h"


Calculator::Calculator(string expression)
{
	this->expression = expression;
}


double Calculator::Calculate()
{
	char *vars = new char[255];
	int i=0;
	for(i=0;i<this->expression.size();i++)
	{
		vars[i] = this->expression[i];
	}
	vars[i]='\0';
	hash_map<char,double>::iterator itr = this->context.Variable.begin();
	double value=0;
	for (i=0;i<strlen(vars) && vars[i]!='\0';i++)
	{
		if (vars[i] == '+' || vars[i] == '-' || vars[i] == '*' || vars[i] == '/')
		{
			continue;
		}
		itr = this->context.Variable.find(vars[i]);
		if (itr == this->context.Variable.end())
		{
			cout<<vars[i]<<"=";
			cin>>value;
			this->context.Variable.insert( pair<char,double>( vars[i],value));
		}
	}
	Expression *left = new VariableExpression(vars[0]);
	Expression *right = NULL;
	stack<Expression*> stack;
	stack.push(left);
	for (i = 1; i < strlen(vars) && vars[i]!='\0'; i += 2)
	{
		left = stack.top();
		stack.pop();
		right = new VariableExpression(vars[i + 1]);
		switch (vars[i])
		{
			case '+':
                stack.push(new AddExpression(left, right));
                break;
			case '-':
				stack.push(new SubExpression(left, right));
				break;
			case '*':
				stack.push(new MulExpression(left, right));
				break;
			case '/':
				stack.push(new DivExpression(left, right));
				break;
		}
	}
	value = stack.top()->Interpret(this->context);
	stack.pop();

	delete left;
	delete right;

	return value;
}
