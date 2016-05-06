
using System;
using System.Collections.Generic;
namespace DesignPattern.Interpreter
{
    public class Calculator
    {
        private string expression;
        private Context context;

        public Calculator(string expression)
        {
            this.expression = expression;
            this.context = new Context();
        }

        public double Calculate()
        {
            char[] vars = this.expression.ToCharArray();
            foreach (char c in vars)
            {
                if (c == '+' || c == '-' || c == '*' || c == '/')
                {
                    continue;
                }
                if (!this.context.Variable.ContainsKey(c))
                {
                    Console.Write(c + "=");
                    this.context.Variable.Add(c, double.Parse(Console.ReadLine()));
                }
            }
            Expression left = new VariableExpression(vars[0]);
            Expression right = null;
            Stack<Expression> stack = new Stack<Expression>();
            stack.Push(left);
            for (int i = 1; i < vars.Length; i += 2)
            {
                left = stack.Pop();
                right = new VariableExpression(vars[i + 1]);
                switch (vars[i])
                {
                    case '+':
                        stack.Push(new AddExpression(left, right));
                        break;
                    case '-':
                        stack.Push(new SubExpression(left, right));
                        break;
                    case '*':
                        stack.Push(new MulExpression(left, right));
                        break;
                    case '/':
                        stack.Push(new DivExpression(left, right));
                        break;
                }
            }
            double value = stack.Pop().Interpret(this.context);
            stack.Clear();
            return value;
        }
    }
}
