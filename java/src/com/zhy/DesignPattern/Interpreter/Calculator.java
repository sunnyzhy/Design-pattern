package com.zhy.DesignPattern.Interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Calculator {

    private String expression;
    private Context context;

    public Calculator(String expression)
    {
        this.expression = expression;
        this.context = new Context();
    }

    public double Calculate() throws IOException
    {
        char[] vars = this.expression.toCharArray();
        for (char c : vars)
        {
            if (c == '+' || c == '-' || c == '*' || c == '/')
            {
                continue;
            }
            if (!this.context.getVariable().containsKey(c))
            {
            	System.out.print(c + "=");
                this.context.getVariable().put(Character.valueOf(c), Double.valueOf((new BufferedReader(new InputStreamReader(System.in))).readLine()));
            }
        }
        Expression left = new VariableExpression(vars[0]);
        Expression right = null;
        Stack<Expression> stack = new Stack<Expression>();
        stack.push(left);
        for (int i = 1; i < vars.length; i += 2)
        {
            left = stack.pop();
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
        double value = stack.pop().Interpret(this.context);
        stack.clear();
        return value;
    }
}
