
using System.Collections.Generic;
namespace DesignPattern.Interpreter
{
    /// <summary>
    /// 操作符，非终结符表达式
    /// </summary>
    public abstract class OperatorExpression : Expression
    {
        protected Expression left;
        protected Expression right;

        public OperatorExpression(Expression left, Expression right)
        {
            this.left = left;
            this.right = right;
        }
    }
}
