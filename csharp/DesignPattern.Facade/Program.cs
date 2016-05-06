
using System;
namespace DesignPattern.Facade
{
    /// <summary>
    /// 外观模式（Facade）
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            Facade facade = new Facade();
            facade.Cook();

            Console.Read();
        }
    }
}
