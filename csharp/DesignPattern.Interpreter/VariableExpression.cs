
namespace DesignPattern.Interpreter
{
    /// <summary>
    /// 变量，终结符表达式
    /// </summary>
    public class VariableExpression : Expression
    {
        private char key;
        public VariableExpression(char key)
        {
            this.key = key;
        }

        public override double Interpret(Context context)
        {
            return context.Variable[this.key];
        }
    }
}
