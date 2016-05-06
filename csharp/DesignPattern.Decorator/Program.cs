
using System;
namespace DesignPattern.Decorator
{
    /// <summary>
    /// 装饰模式（Decorator）
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            Food noodles = new Noodles();
            Egg egg = new Egg(noodles);
            Tomato tomato = new Tomato(egg);
            tomato.Cook();

            Console.Read();
        }
    }
}
