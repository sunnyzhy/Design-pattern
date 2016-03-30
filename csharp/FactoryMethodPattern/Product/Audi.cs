using System;

namespace FactoryMethodPattern.Product
{
    /// <summary>
    /// 奥迪
    /// </summary>
    public class Audi : ICar
    {
        public void Print()
        {
            Console.WriteLine("这是一辆奥迪车.");
        }
    }
}