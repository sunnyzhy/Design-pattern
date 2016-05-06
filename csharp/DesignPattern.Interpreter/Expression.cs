
using System.Collections.Generic;
namespace DesignPattern.Interpreter
{
    /// <summary>
    /// 抽象表达式
    /// </summary>
    public abstract class Expression
    {
        public abstract double Interpret(Context context);
    }
}
