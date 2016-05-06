
using System;
using System.Configuration;
using System.Reflection;
namespace DesignPattern.Adapter
{
    /// <summary>
    /// 适配器模式（Adapter）
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            ICalculation calculation = new Calculation();
            Console.WriteLine(calculation.Add(1.1, 2.2));

            string value = ConfigurationManager.AppSettings["adapterPattern"];
            string assembly = value.Substring(0, value.LastIndexOf('.'));
            assembly = assembly.Substring(0, assembly.LastIndexOf('.'));
            calculation = (ICalculation)Assembly.Load(assembly).CreateInstance(value);
            Console.WriteLine(calculation.Add(1.1, 2.2));

            Console.Read();
        }
    }
}
