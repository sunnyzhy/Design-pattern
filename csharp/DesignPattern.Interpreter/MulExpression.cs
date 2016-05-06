
namespace DesignPattern.Interpreter
{
    public class MulExpression: OperatorExpression
    {
        public MulExpression(Expression left, Expression right)
            : base(left, right)
        { 
        
        }

        public override double Interpret(Context context)
        {
            return this.left.Interpret(context) * this.right.Interpret(context);
        }
    }
}
