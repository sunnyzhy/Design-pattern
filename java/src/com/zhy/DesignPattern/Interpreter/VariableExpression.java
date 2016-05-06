package com.zhy.DesignPattern.Interpreter;

public class VariableExpression extends Expression {

    private char key;
    public VariableExpression(char key)
    {
        this.key = key;
    }

	@Override
	public double Interpret(Context context) {
		// TODO Auto-generated method stub
		return context.getVariable().get(this.key);
	}
}
