package com.zhy.DesignPattern.Interpreter;

public class SubExpression extends OperatorExpression {

	public SubExpression(Expression left,Expression right) {
		// TODO Auto-generated constructor stub
		super(left, right);
	}
	
	@Override
	public double Interpret(Context context) {
		// TODO Auto-generated method stub
		return this.left.Interpret(context) - this.right.Interpret(context);
	}
}
