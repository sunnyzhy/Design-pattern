
using System;
using System.Configuration;
using System.Reflection;
namespace DesignPattern.Builder
{
    /// <summary>
    /// 建造者模式（Builder）
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            Director director = new Director();
            string value = ConfigurationManager.AppSettings["builderPattern"];
            string assembly = value.Substring(0, value.LastIndexOf('.'));
            IBuilder builder = (IBuilder)Assembly.Load(assembly).CreateInstance(value);
            director.Constrcut(builder);
            Car car = builder.CreateCar();

            Console.Read();
        }
    }
}
