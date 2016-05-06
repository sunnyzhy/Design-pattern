
using System;
using System.Configuration;
namespace DesignPattern.SimpleFactory
{
    /// <summary>
    /// 简单工厂(DesignPattern.SimpleFactory)
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            string value = ConfigurationManager.AppSettings["simpleFactoryPattern"];
            CarFactory factory = new CarFactory();
            factory.name = value;
            ICar car = factory.CreateCar();
            car.Print();

            Console.Read();
        }
    }
}
