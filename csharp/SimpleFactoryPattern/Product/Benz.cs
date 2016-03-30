using System;

namespace SimpleFactoryPattern.Product
{
    /// <summary>
    /// 奔驰类
    /// </summary>
    public class Benz : ICar
    {
        public void Print()
        {
            Console.WriteLine("这是一辆奔驰车.");
        }
    }
}
