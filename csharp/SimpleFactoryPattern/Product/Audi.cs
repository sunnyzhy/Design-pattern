using System;

namespace SimpleFactoryPattern.Product
{
    /// <summary>
    /// 奥迪类
    /// </summary>
    public class Audi : ICar
    {
        public void Print()
        {
            Console.WriteLine("这是一辆奥迪车.");
        }
    }
}