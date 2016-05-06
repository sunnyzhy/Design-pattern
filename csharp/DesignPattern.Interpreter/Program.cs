
using System;
namespace DesignPattern.Interpreter
{
    /// <summary>
    /// 解释器模式（Interpreter）
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            string expression = Console.ReadLine();
            Calculator calculator = new Calculator(expression);
            double value = calculator.Calculate();
            Console.WriteLine(expression + "=" + value);

            Console.Read();
        }
    }
}
