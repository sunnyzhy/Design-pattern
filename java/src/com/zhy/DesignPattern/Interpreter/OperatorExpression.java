package com.zhy.DesignPattern.Interpreter;

public abstract class OperatorExpression extends Expression {

    protected Expression left;
    protected Expression right;
    
	public OperatorExpression(Expression left,Expression right) {
		// TODO Auto-generated constructor stub
		this.left = left;
		this.right = right;
	}

}
