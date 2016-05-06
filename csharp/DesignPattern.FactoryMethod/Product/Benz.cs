using System;

namespace DesignPattern.FactoryMethod.Product
{
    /// <summary>
    /// 奔驰
    /// </summary>
    public class Benz : ICar
    {
        public void Print()
        {
            Console.WriteLine("这是一辆奔驰车.");
        }
    }
}
