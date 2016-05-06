
using System;
using System.Configuration;
using System.Reflection;
namespace DesignPattern.AbstractFactory
{
    /// <summary>
    /// 抽象工厂(AbstractFactoryPattern)
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            string value = ConfigurationManager.AppSettings["abstractFactoryPattern"];
            string assembly = value.Substring(0, value.LastIndexOf('.'));
            assembly = assembly.Substring(0, assembly.LastIndexOf('.'));
            ICarFactory factory = (ICarFactory)Assembly.Load(assembly).CreateInstance(value);
            IBody body = factory.CreateBody();
            body.Install();
            IEngine engine = factory.CreateEngine();
            engine.Install();
            IWheel wheel = factory.CreateWheel();
            wheel.InstallLeftFrontWheel();
            wheel.InstallRightFrontWheel();
            wheel.InstallLeftBackWheel();
            wheel.InstallRightBackWheel();

            Console.Read();
        }
    }
}
