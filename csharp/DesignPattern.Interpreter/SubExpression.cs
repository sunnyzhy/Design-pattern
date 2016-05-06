
using System.Collections.Generic;
namespace DesignPattern.Interpreter
{
    public class SubExpression : OperatorExpression
    {
        public SubExpression(Expression left, Expression right)
            : base(left, right)
        {

        }

        public override double Interpret(Context context)
        {
            return this.left.Interpret(context) - this.right.Interpret(context);
        }
    }
}
