
using System;
using System.Configuration;
using System.Reflection;
namespace DesignPattern.FactoryMethod
{
    /// <summary>
    /// 工厂方法(FactoryMethodPattern)
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            string value = ConfigurationManager.AppSettings["factoryMethodPattern"];
            string assembly = value.Substring(0, value.LastIndexOf('.'));
            assembly = assembly.Substring(0, assembly.LastIndexOf('.'));
            ICarFactory factory = (ICarFactory)Assembly.Load(assembly).CreateInstance(value);
            ICar car = factory.CreateCar();
            car.Print();

            Console.Read();
        }
    }
}
